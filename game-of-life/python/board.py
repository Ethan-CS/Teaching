"""
Game of Life: Board Class
Ethan Kelly
"""

from cell import Cell
from random import randint


class Board:
    def __init__(self, rows, columns):
        # Constructor holds input from user and populates the grid with cells.
        self._rows = rows
        self._columns = columns
        self._grid = [[Cell() for column_cells in range(self._columns)] for row_cells in range(self._rows)]

        self._generate_board()

    def draw_board(self):
        # Method that draws the actual board in the terminal
        print()
        print('printing board')
        for row in self._grid:
            for column in row:
                print(column.get_print_character(), end='  ')
            print()  # To create a new line

    def _generate_board(self):
        # Sets the random state of all cells.

        for row in self._grid:
            for column in row:
                # 33% chance the cells spawn alive.
                chance_number = randint(0, 2)
                if chance_number == 1:
                    column.set_alive()

    def update_board(self):
        # Updates the board based on the check of each cell's previous generation

        survives = []
        dies = []

        for row in range(len(self._grid)):
            for column in range(len(self._grid[row])):
                # Check neighbours of the previous square:
                check_neighbour = self.check_neighbour(row, column)

                living_neighbours_count = []

                for neighbour_cell in check_neighbour:
                    # Check live status for neighbour_cell:
                    if neighbour_cell.is_alive():
                        living_neighbours_count.append(neighbour_cell)

                cell_object = self._grid[row][column]
                status_main_cell = cell_object.is_alive()

                # If the cell is alive, check the neighbour status
                if status_main_cell:
                    if len(living_neighbours_count) < 2 or len(living_neighbours_count) > 3:
                        dies.append(cell_object)

                    if len(living_neighbours_count) == 3 or len(living_neighbours_count) == 2:
                        survives.append(cell_object)

                else:
                    if len(living_neighbours_count) == 3:
                        survives.append(cell_object)

        # Set status of each cell
        for cell_items in survives:
            cell_items.set_alive()

        for cell_items in dies:
            cell_items.set_dead()

    def check_neighbour(self, check_row, check_column):
        # Checks all neighbours for all cells,
        # Returns the list of the valid neighbours so status can be updated.

        # Search depth
        search_min = -1
        search_max = 2

        neighbour_list = []
        for row in range(search_min, search_max):
            for column in range(search_min, search_max):
                neighbour_row = check_row + row
                neighbour_column = check_column + column

                valid_neighbour = True

                if neighbour_row == check_row and neighbour_column == check_column:
                    valid_neighbour = False

                if neighbour_row < 0 or neighbour_row >= self._rows:
                    valid_neighbour = False

                if neighbour_column < 0 or neighbour_column >= self._columns:
                    valid_neighbour = False

                if valid_neighbour:
                    neighbour_list.append(self._grid[neighbour_row][neighbour_column])
        return neighbour_list
