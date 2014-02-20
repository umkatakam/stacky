package com.gwt.stacky.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Stacky implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		Panel contentPanel = new FlowPanel();
		contentPanel.getElement().setAttribute("style", "margin:0 auto;width:1240px;");
		final StackPanel stackPanel = new StackPanel();
		contentPanel.add(stackPanel);
		Button next = new Button("Next");
		next.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				stackPanel.add(new Card());
			}
		});
		contentPanel.add(next);

		rootPanel.add(contentPanel);

	}
}
