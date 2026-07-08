package lab02;

public class EX03 {

    public static void main(String[] args) {

        String[] subjects = {"I-201", "B-112", "T-201", "N-201", "E-211"};
        displayArray("Original", subjects);

        System.out.println();

        String new_subject = "C-111";
        subjects = addArraySize(subjects);
        subjects[subjects.length - 1] = new_subject;
        displayArray("Already appended element", subjects);

        System.out.println();

        int delete_index1 = 3;
        subjects = deleteElement(delete_index1, subjects);
        displayArray("Already deleted index " + delete_index1, subjects);

        System.out.println();

        int delete_index2 = 0;
        subjects = deleteElement(delete_index2, subjects);
        displayArray("Already deleted index " + delete_index2, subjects);

        System.out.println();

        int delete_index3 = subjects.length - 1;
        subjects = deleteElement(delete_index3, subjects);
        displayArray("Already deleted last index", subjects);

        System.out.println();

        int index_update = 1;
        String element_update = "MTE-201";
        subjects = updateElement(index_update, element_update, subjects);
        displayArray("Already updated element", subjects);

    }

    public static void displayArray(String message, String[] subjects) {

        System.out.print(message + " : ");

        boolean first = true;

        for (String subject : subjects) {
            System.out.print((!first ? ", " : "") + subject);
            first = false;
        }

        System.out.println();
    }

    // เพิ่มสมาชิก 1 ช่อง
    public static String[] addArraySize(String[] subjects) {

        String[] newSubjects = new String[subjects.length + 1];

        for (int i = 0; i < subjects.length; i++) {
            newSubjects[i] = subjects[i];
        }

        return newSubjects;
    }

    // ลบข้อมูลตามตำแหน่ง
    public static String[] deleteElement(int index, String[] subjects) {

        String[] newSubjects = new String[subjects.length - 1];

        int j = 0;

        for (int i = 0; i < subjects.length; i++) {

            if (i != index) {
                newSubjects[j] = subjects[i];
                j++;
            }

        }

        return newSubjects;
    }

    // แก้ไขข้อมูล
    public static String[] updateElement(int index, String value, String[] subjects) {

        subjects[index] = value;

        return subjects;
    }

}