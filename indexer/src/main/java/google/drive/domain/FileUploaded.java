package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileName;
    private String fileType;
    private Integer fileSize;
    private Long userId;
}


