# John Conway's _Game of Life_
   
## Introduction

   The _Game of Life,_ or simply _Life,_ is a zero-player game devised by mathematician John Conway in 1970. It is played on an infinite, 2D grid composed of square cells. A cell can have a living inhabitant, which can be specified in the initialisation (seed) and then determined by the rules of the game which are as follows (I've summarised these in a table below, too):
* A live cell with 0 or 1 neighbours dies (underpopulation)
* A live cel with 2 or 3 neighbours remains as it is (survives)
* A live cell with 4 or more neighbours dies (overpopulation)
* An uninhabited cell with precisely 3 neighbours becomes a live cell (reproduction).

These rules were settled on by Conway after very careful consideration of the game dynamics, and the result is a really fascinating game that piqued the interest of many parts of the scientific community, in particular computing scientists. The four criteria that Conway specified for this game were:
1. No explosive growth
2. Some initial patterns with chaotic, unpredictable outcomes
3. Potential for von Neumann universal constructors (self-replicating 'machines')
4. The rules should be as simple as possible, while subject to the above three constraints.

## Patterns

When playing _Life,_ quickly one can see that there are many possibilities for "patterns" to emerge, shapes that have some common behaviour in progressive generations that we can categorise and study. That is, given some initial state of live and dead cells in a certain area, under the rules we have some useful and examinable behaviour. In fact, in the first volume of _Lifeline,_ a "quarterly newsletter for enthusiasts of John Conway's Game of Life," we see a classification of objects:

![Classification of Life Objects](/game-of-life/img/classification.jpg)

### Class I: Still Lives
Still lives do not change from one generation to the next - they are stationary _ad infinitum._ While not very interesting in their own right, understanding still lives means their poperties can be utilised when constructing more complex objects. Perhaps the most famous example of a still life in _Life_ is the block:

![Block](/game-of-life/img/block.png)

### Class II: Oscillators
The class of oscillators is a superclass of the still lives, which can be thought of as all the oscillators with period 1. This more general class are patterns that precede themselves - they repeat themselves after some number of generations, called the period. We often talk about a rotor and stator of an oscillator, which are the oscillating cells and the static cells which remain alive throughout respectively. The example given in the above classification is the blinker:

![Blinker](/game-of-life/img/blinker.gif)

### Class III: Spaceships
Spaceships (or gliders) are finite patterns that move across the grid, returning periodically to their original shape but in a new location each time. The most common type of spaceship is called _the_ glider (because we talk about it so much) and is the smallest spaceship:

![Glider](/game-of-life/img/glider.gif)


## Summary of Rules

I've summarised the rules of _Life_ in the table below. Here, 0 represents an empty cell and 1 represents a cell with a live occupant (referred to geneally as a "live cell").
   
| Cell Status | # Neighbours (n) | New Cell Status | Explanation     |
| ----------- | ---------------- | --------------- | --------------- |
|      1      |     n = 0, 1     |        0        | Underpopulation |
|      1      |    4 <= n <= 8   |        0        | Overpopulation  |
|      1      |     n = 2, 3     |        1        | Survival        |
|      0      |       n = 3      |        1        | Reproduction    |
