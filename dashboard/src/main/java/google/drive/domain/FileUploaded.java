package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileName;
    private String fileType;
    private Integer fileSize;
    private Long userId;
}
