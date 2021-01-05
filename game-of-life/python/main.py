"""
Game of Life
E Kelly
"""

from board import Board


def main():
    print('Initialising Conway\'s Game of Life')
    rows = input('Input number of rows:\n')
    columns = input('Input number of columns:\n')

    user_rows = int(rows)
    user_columns = int(columns)

    # Initialise board:
    game_of_life_board = Board(user_rows, user_columns)

    # Run the first iteration of the board:
    game_of_life_board.draw_board()

    user_input = ''
    while user_input.lower() != 'q':
        user_input = input('Would you like to (p)rogress a generation or (q)uit the game?\n')

        if user_input.lower() == 'p':
            game_of_life_board.update_board()
            game_of_life_board.draw_board()


main()
