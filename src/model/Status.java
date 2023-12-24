package model;

public enum Status {

    ENROLLED("재학", "신입학"),
    ATTENDING("재학", "재학"),
    LEAVE_OF_ABSENCE("재학", "휴학"),
    GRADUATED("졸업", "졸업"),
    DROPOUT("자퇴", "자퇴");

    private final String generalStatus;
    private final String detailStatus;

    Status(String generalStatus,
           String detailStatus) {
        this.generalStatus = generalStatus;
        this.detailStatus = detailStatus;
    }

    public boolean isValidStatus() {
        return isEnrolled() || isAttending() || isLeaveOfAbsence();
    }

    public static Status getStatusFromString(String general) {
        return findMatchingStatus(general);
    }

    private static Status findMatchingStatus(String general) {
        for (Status status : Status.values()) {
            if (isEqualParentStatus(status, general)) {
                return status;
            }
        }
        throw new IllegalArgumentException("[ERROR] Invalid general status: " + general);
    }

    private static boolean isEqualParentStatus(Status status, String general) {
        return status.generalStatus.equals(general);
    }

    private boolean isEnrolled() {
        return this.generalStatus.equals("신입학");
    }

    private boolean isAttending() {
        return this.generalStatus.equals("재학");
    }

    private boolean isLeaveOfAbsence() {
        return this.generalStatus.equals("휴학");
    }
}