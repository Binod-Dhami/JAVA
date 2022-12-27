
Class cls = MyClass.class;
Constructor constructor = cls.getConstructor();
Class cls = MyClass.class;
Field field = cls.getDeclaredField("fieldName");
field.setAccessible(true);
Class cls = MyClass.class;
Method method = cls.getDeclaredMethod("methodName", int.class, String.class);
method.setAccessible(true);
// Invoke the constructor to create a new instance of the class
MyClass obj = (MyClass)constructor.newInstance();

// Get the value of a private field
Object fieldValue = field.get(obj);

// Set the value of a private field
field.set(obj, "newValue");

// Invoke a private method
Object result = method.invoke(obj, 10, "arg");
