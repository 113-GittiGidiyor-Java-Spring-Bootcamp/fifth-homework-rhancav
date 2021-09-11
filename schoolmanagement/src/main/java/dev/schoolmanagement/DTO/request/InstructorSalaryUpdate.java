package dev.schoolmanagement.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InstructorSalaryUpdate {
    private UpdateType updateType;
    private double rate;
    public enum UpdateType{
        RAISE,
        CUT
    }
}
