package Week4;

import Week4.Entities.Campaign;

public class CampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi!");
	}
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi!");
		
	}
	public void delete(Campaign campaign) {
		System.out.println("Bu kampanya art�k mevcut de�il!");
	}
}
