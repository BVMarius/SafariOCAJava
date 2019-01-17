package polymorph;

public class Holiday extends Date {
  private String name;
  // ANY explicit constructor removes the default
  // explicit constructor, mimics "default" constructor
  public Holiday(int day, int month, int year, String name) {
    super(day, month, year);
    this.name = name;
  }

  public String toString () {
    return "Holiday called " +  name;
  }
}

/* If change existing code to ... Holiday extends Date
   what happens?
   A) All Holiday instances may be viewed as Date types
   B) Nothing yet
   C) Compilation failure
   D) Holiday objects can be assigned to Date variables, provided we cast.
 */


/*
Which creates Holiday class as a subclass of Date
A) class Holiday isA Date
B) class Holiday implements Date
C) class Holiday : Date
D) class Holiday extends Date
 */

