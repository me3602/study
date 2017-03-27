package observer.impl;

import observer.inter.Heros;
import observer.inter.Observer;
import observer.inter.Subject;
import observer.values.EnemyStatus;

public class Ironman implements Observer,Heros {
	
	public Ironman(){};
	public Ironman(Subject team){
		System.out.println("아이언맨 합류");
		team.add(this);
	}
	
	@Override
	public void update(EnemyStatus stat) {	
		this.behavior(stat);		
	}
	
	//
	@Override
	public void behavior(EnemyStatus stat) {
		switch(stat){
			case NONE: System.out.println("아이언맨 : 대기중"); break;
			case APPEAR: System.out.println("아이언맨 : 수트 착용"); break;
			case ATTACK: System.out.println("아이언맨 : 해킹당함. 전투불가능 "); break;
			case DISAPPEAR: System.out.println("아이언맨 : 수트 해제"); break;
		}
	}
	

}
