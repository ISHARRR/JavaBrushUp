public class Person {
    private String firstName;
    private String lastName;
    private int age;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100){
            age = 0;
        }
        this.age = age;
    }

    public boolean isTeen(){
        age = getAge();
        if (age > 12 && age < 20){
            return true;
        }
        return false;
    }

    public String getFullName(){
        String f = getFirstName();
        String l = getLastName();
        if (f.isEmpty() && l.isEmpty()){
            return "";
        } else if (l.isEmpty()){
            return f;
        } else if (f.isEmpty()){
            return l;
        } else {
            return (f + " " + l);
        }

    }


}
