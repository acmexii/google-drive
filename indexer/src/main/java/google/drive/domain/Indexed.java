package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String fileName;
    private String userId;
    private Date indexedDate;

    public Indexed(Index aggregate){
        super(aggregate);
    }
    public Indexed(){
        super();
    }
}
