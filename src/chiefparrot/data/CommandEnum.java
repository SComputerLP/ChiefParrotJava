package chiefparrot.data;

/**
 *
 * @author Julian Maierl
 */
public enum CommandEnum {

    MOVE_RELATIVE("move_relative"), MOVE_ABSOULTE("move_absolute"), MOVE_HOME("move_home");

    String name;

    /**
     *
     * @param name name
     */
    private CommandEnum(String name) {
        this.name = name;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param s string value
     * @return CommandEnum
     */
    public CommandEnum stringToEnum(String s) {
        for (CommandEnum e : CommandEnum.values()) {
            if (s.equals(e.getName())) {
                return e;
            }
        }
        return null;
    }
}
