package org.vaadin.addons.wrapper;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.dom.DomEventListener;

public class StopEventPropagationWrapper extends Div {
	public StopEventPropagationWrapper(Component componentToAdd) {
		add(componentToAdd);
		this.getElement().addEventListener("click", new DomEventListener() {
			@Override
			public void handleEvent(com.vaadin.flow.dom.DomEvent event) {
				// nothing should happen
			}
		}).addEventData("event.stopPropagation()");
	}
}
