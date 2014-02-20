package com.gwt.stacky.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwt.stacky.resources.ICardResources;

public class Card extends Composite {

	private static CardUiBinder uiBinder = GWT.create(CardUiBinder.class);
	private static ICardResources DEFAULT_RESOURCES = GWT.create(ICardResources.class);

	interface CardUiBinder extends UiBinder<Widget, Card> {
	}

	@UiField(provided = true)
	ICardResources resource;

	@UiField
	HTMLPanel header;

	@UiField
	HTMLPanel content;

	@UiField
	HTMLPanel panel;

	public Card() {
		this(DEFAULT_RESOURCES);
	}

	public Card(ICardResources resource) {
		this.resource = resource;
		this.resource.getStyle().ensureInjected();
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setPosition(int cardIndex) {
		panel.getElement().getStyle().setTop((50.0 * cardIndex), Unit.PX);
	}
}
