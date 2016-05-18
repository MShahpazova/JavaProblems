package stardust;

public abstract class Person {
    private String name;
    private String birthDate;

    public Person(String name, String birthDate) {
        this.setName(name);
        this.setBirthDate(birthDate);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setBirthDate(String birthDate){
        if (birthDate == null || birthDate.isEmpty()){
            throw new IllegalArgumentException("Date of birth must not be empty.");
        }
            this.birthDate = birthDate;
    }

    public String getBirthDate(){
        return birthDate;
    }
}
