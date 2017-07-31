package com.hr.command;

/**
 * Created by hr on 2017/07/06.
 */
public class EditCodeCommand extends Command{

    @Override
    public void execute() {
        super.setGroup(new CodeGroup());
        super.group.action();
    }
}
