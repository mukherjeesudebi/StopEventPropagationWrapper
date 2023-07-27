package org.vaadin.addons.componentfactory;

import org.vaadin.addons.wrapper.StopEventPropagationWrapper;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class AddonView extends Div {

    public AddonView() {
    	Button button = new Button("Test Button");
        StopEventPropagationWrapper theAddon = new StopEventPropagationWrapper(button);
        theAddon.setId("theAddon");
        add(theAddon);
    }
}
