# Factory Design Pattern

## Java Implementation: The Shape Factory


The Factory design pattern is used when we want to give an interface allowing us to create families of connected objects without exposing the concrete classes. This is most useful when we have a general pattern that our objects will follow, as we can ensure minimal repetition of code (high cohesion, low coupling).

### Code overview

This simple implementation of the Factory pattern has the following structure:

__Interface:__ `Shape` - contains a `draw()` method which will be overriden by each concrete class which implements this interface.


__Concrete Classes:__

* `Circle` - implements `Shape`, prints a circle to the console.
* `Square` - implements `Shape`, prints a square to the console.
* `Rectangle` - implements `Shape`, prints a rectangle to the console.
* `ShapeFactory` - generates objects of the above classes.
* `FactoryEngine` - uses `ShapeFactory` to obtain objects of the shape classes by parsing information.


When `FactoryEngine` is run, you should see a circle, square and rectangle printed to the console (in the style of ASCII-art, with asterisk '*' symbols).
