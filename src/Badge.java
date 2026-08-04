public class Badge {

    public String print(Integer id, String name, String department) {
        String idPart = (id == null) ? "" : "[" + id + "] - ";
        String departmentPart = (department == null) ? "OWNER" : department.toUpperCase();
        return idPart + name + " - " + departmentPart;
    }

    public static void main(String[] args) {
        Badge badge = new Badge();

        System.out.println(badge.print(17, "Ryder Herbert", "Marketing"));
        

        System.out.println(badge.print(43, "Zahra", "Computer Science"));
    

        System.out.println(badge.print(null, "Mome", "Pharmacy"));
        // Mome - PHARMACY

        System.out.println(badge.print(59, "Julie Sokato", null));
        // [59] - Julie Sokato - OWNER
    }
}