
public class Section {
    static private int numberOfSections=0;

    private String name_section;
    private int number_section;

    public Section(String name_section){
        this.name_section=name_section;
        numberOfSections++;
        number_section=numberOfSections;

    }

    public String getSectionName(){
    return name_section;
    }
    public int getNumberOfSection(){return number_section;}
    
}
