# Pluralsight course: `Java SE Advanced Language Features`

## Commands to build and run Java files.

Run this commands from `demo` location in this repository.

### Compile
```bash
javac 00_Before/02/src/main/java/com/pluralsight/advancedjava/examples/example01/*.java -d 00_Before/02/target/classes/
```

### Run
```bash
java -cp 00_Before/02/target/classes com.pluralsight.advancedjava.examples.example01.Main
```

## Branches

- `main` branch: Code from `before` has not been modified
- `solved` branch: Other changes that I added while considering the Pluralsight course.


## Topics covered in this course (number of modules detailed)
2. Sealed Classes and Interfaces
3. Pattern Matching (`s instanceof SomeClass someClassVariable`)
4. Advanced Classes and Interfaces
   - Static / non-static nested classes (`better 'static', when you can, like defining a 'Builder'`)
   - Nested enums, records and interfaces
     - `Static` by default
5. Advanced Generics
   - Single capital letter names for type parameters are a widely accepted convention
     - `<T>` , `<K,V>`
   - You cannot use `primitive types` as type arguments.
   - You can only use `reference types` as type arguments (`String, Integer, Object...`)
6. Lambda expressions
   - They introduce what is known as `functional programming`
   - `Method references`:
     - `TypeName::staticMethodName`: Reference to a static method
     - `objectRef::instanceMethodName`: Reference to an instance method of a specific object
     - `TypeName::instanceMethodName`: Reference to an instance method context determines the object
     - `TypeName::new`: Reference to a constructor

## Important insights

- Better to use `sealed interface + records`, rather than `abstract base classes + polimorphism`
  - Last part of this conversation: [ChatGPT](https://chatgpt.com/share/6706457c-2604-8010-9a42-fcc7057eb035).
  - As I understood, this is not an strategy which is used so much, compared to others, in Java.
- There is not `pattern matching` code in this repo, because I need to have `Java 21` al least.
  - Take into account, if I want to investigate this feature in the future, because it looks useful.
  - How to do it: [ChatGPT](https://chatgpt.com/share/6706506b-a208-8010-b57e-08df0a83a94a)
- `Generics` and `Wildcards`: it becomes caothic when I go deeper and deeper
  - Investigate only when necessary.
  - Investigate only when it is useful to apply these tools to the system. I think that, if I use it too much, it might lead to coupling of types.
  - Tools only considered at `compile level`, not at `runtime`
- There is something known as `wither methods` at interface / class level (remember)
