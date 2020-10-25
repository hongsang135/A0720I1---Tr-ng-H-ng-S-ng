package b10.danh_sach.bai_tap.linked_list;

public class LinkedListTest {
    public static void main(String[] args) throws IllegalAccessException {
        class Student{
            private int id;
            private String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public Student() {
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        MyLinkedList myLinkedList = new MyLinkedList();
        Student student1 = new Student(1,"sang");
        Student student2 = new Student(2,"nam");
        Student student3 = new Student(3,"thanh");
        Student student4 = new Student(4,"van");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);
        myLinkedList.addLast(student4);

        for (int i = 0; i < myLinkedList.size() ; i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
        myLinkedList.remove(2);

        for (int i = 0; i < myLinkedList.size() ; i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}
