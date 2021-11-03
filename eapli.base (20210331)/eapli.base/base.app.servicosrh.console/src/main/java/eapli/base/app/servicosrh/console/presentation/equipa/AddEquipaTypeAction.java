package eapli.base.app.servicosrh.console.presentation.equipa;

import eapli.framework.actions.Action;

/**
 * Menu action for adding a new user to the application. Created by nuno on
 * 22/03/16.
 */
public class AddEquipaTypeAction implements Action {

    @Override
    public boolean execute() {
        return new AddEquipaTypeUI().show();
    }
}
