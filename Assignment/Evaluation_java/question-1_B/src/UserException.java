public class UserException {
    public static void main(String[] args) throws CheckedException {
        demostrateChecked();
        demostrateUnchecked();
    }
    private static void demostrateChecked() throws CheckedException {
        boolean condition=false;
        if(condition){
            throw new CheckedException("Checked Exception");
        }
    }
    private static void demostrateUnchecked(){
        boolean condition=true;
        if(condition){
            throw new UncheckedException("Unchecked Exception");
        }
    }
}
