package edu.neumont.csc150.destitute.game.model.units;

import edu.neumont.csc150.destitute.game.model.Buyable;

public abstract class Unit extends Buyable{
	private int currentMovement;
	private int totalMovement;
	private int attackDamage;
	/**
	 * @return the currentMovement
	 */
	public int getCurrentMovement() {
		return currentMovement;
	}
	/**
	 * @param currentMovement the currentMovement to set
	 */
	public void setCurrentMovement(int currentMovement) {
		this.currentMovement = currentMovement;
	}
	/**
	 * @return the totalMovement
	 */
	public int getTotalMovement() {
		return totalMovement;
	}
	/**
	 * @param totalMovement the totalMovement to set
	 */
	public void setTotalMovement(int totalMovement) {
		this.totalMovement = totalMovement;
	}
	/**
	 * @return the attackDamage
	 */
	public int getAttackDamage() {
		return attackDamage;
	}
	/**
	 * @param attackDamage the attackDamage to set
	 */
	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}
}
