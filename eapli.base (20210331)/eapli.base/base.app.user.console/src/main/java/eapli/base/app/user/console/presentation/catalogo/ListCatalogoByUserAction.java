package eapli.base.app.user.console.presentation.catalogo;

import eapli.framework.actions.Action;

/**
 * Menu action for adding a new catalogo to the application.
 */
public class ListCatalogoByUserAction implements Action {

    @Override
    public boolean execute() {
        return new ListCatalogoByUserUI().show();
    }
}
