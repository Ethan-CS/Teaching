"""
Game of Life: Board
E Kelly
"""

class Cell:
    def __init__(self):
        # Class holding initial status of cell
        # Class can set and fetch new statuses with functions
        self._status = 'Dead'

    def set_dead(self):
        # Sets the cell status to DEAD
        self._status = 'Dead'

    def set_alive(self):
        # Sets the cell status to ALIVE
        self._status = 'Alive'

    def is_alive(self):
        # method checks if the cell is ALIVE - returns True if it is alive, False if not.
        if self._status == 'Alive':
            return True
        return False

    def get_print_character(self):
        # Returns a status character to print on the board
        if self.is_alive():
            return '#'
        return '.'