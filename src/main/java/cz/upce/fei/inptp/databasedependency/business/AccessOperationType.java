package cz.upce.fei.inptp.databasedependency.business;

/**
 * Operation type
 */
public enum AccessOperationType {
    Read("ro"),
    Write("rw");

    private String op;

    private AccessOperationType(String op) {
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    @Override
    public String toString() {
        return "AccessOperationType{" + "op=" + op + '}';
    }

}
