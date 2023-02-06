package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class SreamProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String videoUrl;
    private String userId;
    private Date processedDate;
}
