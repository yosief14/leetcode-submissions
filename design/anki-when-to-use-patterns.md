# Anki cards: When should you use each design pattern?

Source: [Refactoring Guru — Catalog of Design Patterns](https://refactoring.guru/design-patterns/catalog)

Answers are the **Applicability** points from each pattern page.

---

## Creational patterns

### Factory Method

Q: When should you use the Factory Method?

A:

1. Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
2. Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.
3. Use the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.

Source: https://refactoring.guru/design-patterns/factory-method

---

### Abstract Factory

Q: When should you use the Abstract Factory?

A:

1. Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility.
2. Consider implementing the Abstract Factory when you have a class with a set of Factory Methods that blur its primary responsibility.

Source: https://refactoring.guru/design-patterns/abstract-factory

---

### Builder

Q: When should you use the Builder?

A:

1. Use the Builder pattern to get rid of a “telescoping constructor”.
2. Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).
3. Use the Builder to construct Composite trees or other complex objects.

Source: https://refactoring.guru/design-patterns/builder

---

### Prototype

Q: When should you use the Prototype?

A:

1. Use the Prototype pattern when your code shouldn’t depend on the concrete classes of objects that you need to copy.
2. Use the pattern when you want to reduce the number of subclasses that only differ in the way they initialize their respective objects.

Source: https://refactoring.guru/design-patterns/prototype

---

### Singleton

Q: When should you use the Singleton?

A:

1. Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
2. Use the Singleton pattern when you need stricter control over global variables.

Source: https://refactoring.guru/design-patterns/singleton

---

## Structural patterns

### Adapter

Q: When should you use the Adapter?

A:

1. Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of your code.
2. Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass.

Source: https://refactoring.guru/design-patterns/adapter

---

### Bridge

Q: When should you use the Bridge?

A:

1. Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some functionality (for example, if the class can work with various database servers).
2. Use the pattern when you need to extend a class in several orthogonal (independent) dimensions.
3. Use the Bridge if you need to be able to switch implementations at runtime.

Source: https://refactoring.guru/design-patterns/bridge

---

### Composite

Q: When should you use the Composite?

A:

1. Use the Composite pattern when you have to implement a tree-like object structure.
2. Use the pattern when you want the client code to treat both simple and complex elements uniformly.

Source: https://refactoring.guru/design-patterns/composite

---

### Decorator

Q: When should you use the Decorator?

A:

1. Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects.
2. Use the pattern when it’s awkward or not possible to extend an object’s behavior using inheritance.

Source: https://refactoring.guru/design-patterns/decorator

---

### Facade

Q: When should you use the Facade?

A:

1. Use the Facade pattern when you need to have a limited but straightforward interface to a complex subsystem.
2. Use the Facade when you want to structure a subsystem into layers.

Source: https://refactoring.guru/design-patterns/facade

---

### Flyweight

Q: When should you use the Flyweight?

A:

1. Use the Flyweight pattern only when your program must support a huge number of objects which barely fit into available RAM.

It’s most useful when:

- an application needs to spawn a huge number of similar objects
- this drains all available RAM on a target device
- the objects contain duplicate states which can be extracted and shared between multiple objects

Source: https://refactoring.guru/design-patterns/flyweight

---

### Proxy

Q: When should you use the Proxy?

A:

There are dozens of ways to utilize the Proxy pattern. The most popular uses:

1. **Lazy initialization (virtual proxy).** Use when you have a heavyweight service object that wastes system resources by being always up, even though you only need it from time to time.
2. **Access control (protection proxy).** Use when you want only specific clients to be able to use the service object.
3. **Local execution of a remote service (remote proxy).** Use when the service object is located on a remote server.
4. **Logging requests (logging proxy).** Use when you want to keep a history of requests to the service object.
5. **Caching request results (caching proxy).** Use when you need to cache results of client requests and manage the life cycle of this cache, especially if results are quite large.
6. **Smart reference.** Use when you need to be able to dismiss a heavyweight object once there are no clients that use it.

Source: https://refactoring.guru/design-patterns/proxy

---

## Behavioral patterns

### Chain of Responsibility

Q: When should you use the Chain of Responsibility?

A:

1. Use the Chain of Responsibility pattern when your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand.
2. Use the pattern when it’s essential to execute several handlers in a particular order.
3. Use the CoR pattern when the set of handlers and their order are supposed to change at runtime.

Source: https://refactoring.guru/design-patterns/chain-of-responsibility

---

### Command

Q: When should you use the Command?

A:

1. Use the Command pattern when you want to parameterize objects with operations.
2. Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
3. Use the Command pattern when you want to implement reversible operations.

Source: https://refactoring.guru/design-patterns/command

---

### Iterator

Q: When should you use the Iterator?

A:

1. Use the Iterator pattern when your collection has a complex data structure under the hood, but you want to hide its complexity from clients (either for convenience or security reasons).
2. Use the pattern to reduce duplication of the traversal code across your app.
3. Use the Iterator when you want your code to be able to traverse different data structures or when types of these structures are unknown beforehand.

Source: https://refactoring.guru/design-patterns/iterator

---

### Mediator

Q: When should you use the Mediator?

A:

1. Use the Mediator pattern when it’s hard to change some of the classes because they are tightly coupled to a bunch of other classes.
2. Use the pattern when you can’t reuse a component in a different program because it’s too dependent on other components.
3. Use the Mediator when you find yourself creating tons of component subclasses just to reuse some basic behavior in various contexts.

Source: https://refactoring.guru/design-patterns/mediator

---

### Memento

Q: When should you use the Memento?

A:

1. Use the Memento pattern when you want to produce snapshots of the object’s state to be able to restore a previous state of the object.
2. Use the pattern when direct access to the object’s fields/getters/setters violates its encapsulation.

Source: https://refactoring.guru/design-patterns/memento

---

### Observer

Q: When should you use the Observer?

A:

1. Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual set of objects is unknown beforehand or changes dynamically.
2. Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases.

Source: https://refactoring.guru/design-patterns/observer

---

### State

Q: When should you use the State?

A:

1. Use the State pattern when you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.
2. Use the pattern when you have a class polluted with massive conditionals that alter how the class behaves according to the current values of the class’s fields.
3. Use State when you have a lot of duplicate code across similar states and transitions of a condition-based state machine.

Source: https://refactoring.guru/design-patterns/state

---

### Strategy

Q: When should you use the Strategy?

A:

1. Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
2. Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.
3. Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.
4. Use the pattern when your class has a massive conditional statement that switches between different variants of the same algorithm.

Source: https://refactoring.guru/design-patterns/strategy

---

### Template Method

Q: When should you use the Template Method?

A:

1. Use the Template Method pattern when you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure.
2. Use the pattern when you have several classes that contain almost identical algorithms with some minor differences.

Source: https://refactoring.guru/design-patterns/template-method

---

### Visitor

Q: When should you use the Visitor?

A:

1. Use the Visitor when you need to perform an operation on all elements of a complex object structure (for example, an object tree).
2. Use the Visitor to clean up the business logic of auxiliary behaviors.
3. Use the pattern when a behavior makes sense only in some classes of a class hierarchy, but not in others.

Source: https://refactoring.guru/design-patterns/visitor
