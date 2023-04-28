# StudenttIDDescendingOrder
使用TreeSet集合对自定义类进行排序
这段代码实现了一个简单的Java程序，其中定义了一个`Studentt`类，并实现了`Comparable`接口以支持对象的比较和排序。
然后，使用`TreeSet`来存储`Studentt`对象，并打印出排序后的结果。
`Studentt`类包含一个学生的ID和姓名，实现了`compareTo()`方法以便将`Studentt`对象按照ID进行排序，然后在`main()`方法中创建`TreeSet`对象，添加三个`Studentt`对象，
