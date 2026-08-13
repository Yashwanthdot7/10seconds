# Polymorphism

- "Poly" == MANY
- "Morphism" == FORMS

Polymorphism is one of the 4 pillars of OOP. It means one interface, many implementations; or one object behaving in multiple ways.

## Types:

### 1. Run-time polymorphism
    - Also known as **method overriding**

### 2. Compile-time polymorphism
    - Also known as **method overloading**
    - When multiple methods have same name, but different parameters.

*Example:*

```Java
    class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public class poly {
        public static void main(String[] args) {
            Calculator c = new Calculator();
            System.out.println(c.add(1, 5));
            System.out.println(c.add(1, 3, 6));
        }
    }
```