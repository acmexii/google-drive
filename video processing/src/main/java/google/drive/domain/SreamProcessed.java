package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class SreamProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String videoUrl;
    private String userId;
    private Date processedDate;

    public SreamProcessed(Video aggregate){
        super(aggregate);
    }
    public SreamProcessed(){
        super();
    }
}
