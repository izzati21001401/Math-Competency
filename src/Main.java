import java.util.Scanner;

public class Main {
    // Application code
    public static void main(String args[]) {
        int choice, loopChoice;
        int counter = 0;
        int totalSchools = 0;
        String delChoice;
        School schoolsArr[];
        schoolsArr = new School[10];
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("********MATH COMPETENCY EVALUATION SURVEY********");
            System.out.println("1. Add School\n2. Delete School\n3. Display School Data\n4. Add Student Data");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();
            input.nextLine();


            switch(choice){
                case 1:{
                    schoolsArr[counter] = new School();
                    Address addr = new Address();
                    schoolsArr[counter].setName();
                    schoolsArr[counter].setPrincipal();

                    addr.setStreet();
                    addr.setDistrict();
                    addr.setPostcode();
                    addr.setState();
                    schoolsArr[counter].setAddress(addr);
                    counter++;
                    totalSchools++;
                    break;
                }
                case 2:{
                    System.out.println("Enter the name of the school to be deleted : ");
                    delChoice = input.nextLine();
                    int indexToRemove = -1;
                    for (int i = 0; i < schoolsArr.length; i++) {
                        if (schoolsArr[i].getName().equals(delChoice)) {
                            indexToRemove = i;
                            break;
                        }
                    }
                    if (indexToRemove != -1) {
                        // Create a new array with the same size as the original array minus one
                        School[] newSchools = new School[schoolsArr.length - 1];

                        // Copy all the objects from the original array to the new array except for the one that needs to be removed
                        int j = 0;
                        for (int i = 0; i < schoolsArr.length; i++) {
                            if (i != indexToRemove) {
                                newSchools[j] = schoolsArr[i];
                                j++;
                            }
                        }

                        // Set the original array reference to the new array
                        schoolsArr = newSchools;
                    }
                    totalSchools--;
                    break;
                }
                case 3:{
                    for (int i = 0; i<totalSchools; i++){
                        System.out.println("\nName of school is "+ schoolsArr[i].getName());
                        System.out.println("Name of principal is "+ schoolsArr[i].getPrincipal());
                        schoolsArr[i].getAddress();
                    }
                    break;
                }
                case 4 : {
                    Marks marks = new Marks();
                    marks.createData(100);

                    marks.setMark(50, 0);
                    marks.setMark(52, 1);
                    marks.setMark(93, 2);
                    float mark = marks.getMark(0);
                    System.out.println("Marks for student 0 is " + mark);
                    break;
                }
            }
            System.out.print("Continue? (1 - Yes, 2 - No) ");
            loopChoice = input.nextInt();
            System.out.println(" ");
        } while(loopChoice == 1);
    }
}