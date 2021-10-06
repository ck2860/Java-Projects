a. How is this lab an example of reuse through inheritance?
The pokemonTypes: FIRE, GRASS, and WATER (NORMAL is in the "parent" class) inherit all of the states: name, attack, and health. For example, FIRE subclass doesn't need to create its own states so FIRE subclass gets name, attack, and health from the parent class instead.

b. Which parts of the lab are examples of polymorphism?
The example of polymorphism is the behavior in subclasses: beingAttacked method. For example, Pokemon NORMAL gets attacked by any kind of Pokemon types the same in the parent class. However, pokemon GRASS gets attacked by other Pokemon types differently. In this case, GRASS would lose its health by 2X attack of Pokemon FIRE. This is done by overriding the beingAttacked method.