/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiefparrot.data;

/**
 *
 * @author Julian Maierl
 */
public enum CommandEnum {

    MOVE_RELATIVE("move_relative"), MOVE_ABSOULTE("move_absolute"), MOVE_HOME("move_home");

    String name;

    CommandEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public CommandEnum stringToEnum(String s) {
        for (CommandEnum e : CommandEnum.values()) {
            if (s.equals(e.getName())) {
                return e;
            }
        }
        return null;
    }
}
