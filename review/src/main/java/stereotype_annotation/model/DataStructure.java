package stereotype_annotation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class DataStructure {

    @NonNull

//    ExtraHours extraHours = new ExtraHours();
    //@Autowired we will use contructor
    ExtraHours extraHours; // has relationship, do not use new word above
//    @Autowired // commented because we are using lombok annotation allArgs
//    public DataStructure(ExtraHours extraHours) {
//        this.extraHours = extraHours;
//    }

    public void getTotalHours(){
        System.out.println("Total hours: " + (35 + extraHours.getHours()));
    }

//    public void getTotalHours(){
//        System.out.println("Total hours: " + 50 + extraHours.getHours());
//    }

//    public void getTotalHours(){
//        System.out.println("Total hours: " + 50 + new ExtraHours().getHours());
//    }
}
