package dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentJoinCourseDTO {

    private int memberId;
    private int courseId;
    private int enrollmentId;
    private boolean courseCheck;
    private int credit;
    private int currentCount;
    private int capacity;
}