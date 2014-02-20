package com.gwt.stacky.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class StackPanel extends Composite {

	private static StackPanelUiBinder uiBinder = GWT.create(StackPanelUiBinder.class);

	interface StackPanelUiBinder extends UiBinder<Widget, StackPanel> {
	}

	@UiField
	HTMLPanel stackPanel;

	List<Card> listOfCards = new ArrayList<Card>();

	public StackPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void add(Card card) {
		listOfCards.add(card);
		int cardIndex = listOfCards.size();
		card.setPosition(cardIndex);
		stackPanel.add(card);
	}

}
