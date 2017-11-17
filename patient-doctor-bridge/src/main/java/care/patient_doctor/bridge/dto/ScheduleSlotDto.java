package care.patient_doctor.bridge.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ScheduleSlotDto {

    private String id;

    private String doctorId;

    private Long timeStart;

    private Long timeFinish;

}
