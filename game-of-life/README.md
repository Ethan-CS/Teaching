# John Conway's _Game of Life_
   
## Introduction

   The _Game of Life,_ or simply _Life_ is a zero-player game devised by mathematician John Conway in 1970. It is played on an infinite, 2D grid composed of square cells. A cell can have a living inhabitant, which can be specified in the initialisation (seed) and then determined by the rules of the game which are as follows (I've summarised these in a table below, too):
* A live cell with 0 or 1 neighbours dies (underpopulation)
* A live cel with 2 or 3 neighbours remains as it is (survives)
* A live cell with 4 or more neighbours dies (overpopulation)
* An uninhabited cell with precisely 3 neighbours becomes a live cell (reproduction).

These rules were settled on by Conway after very careful consideration of the game dynamics, and the result is a really fascinating game that piqued the interest of many parts of the scientific community, in particular computing scientists. The four criteria that Conway specified for this game were:
1. No explosive growth
2. Some initial patterns with chaotic, unpredictable outcomes
3. Potential for von Neumann universal constructors (self-replicating 'machines')
4. The rules should be as simple as possible, while still subject to the above three constraints.

## Patterns

When playing _Life,_ quickly one can see that there are many possibilities for "patterns" to emerge, shapes that have some common behaviour in progressive generations that we can categorise and study. In fact, in the first volume of _Lifeline,_ a "quarterly newsletter for enthusiasts of John Conway's Game of Life," we see a classification of objects:

![Classification of Life Objects](/game-of-life/classification.jpg)

## Summary of Rules

I've summarised the rules of _Life_ in the table below. Here, 0 represents an empty cell and 1 represents a cell with a live occupant (referred to geneally as a "live cell").
   
| Cell Status | # Neighbours (n) | New Cell Status | Explanation     |
| ----------- | ---------------- | --------------- | --------------- |
|      1      |     n = 0, 1     |        0        | Underpopulation |
|      1      |    4 <= n <= 8   |        0        | Overpopulation  |
|      1      |     n = 2, 3     |        1        | Survival        |
|      0      |       n = 3      |        1        | Reproduction    |
