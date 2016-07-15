package test.animal;

import animal.*;

public class AnimalUnitTest{
	public static void main(String[] args){
		Animal a1 = new Cheetar(); 		// �`�[�^�[
		Animal a2 = new Horse();		// �n
		Animal a3 = new Lion();  		// ���C�I��
		
		// �`�[�^�[							   ���e�X�g����
		System.out.println(a1.getSpeed());	// 110
		System.out.println(a1.getName());	// �`�[�^�[
		System.out.println(a1.race(a1));	// draw
		System.out.println(a1.race(a2)); 	// �`�[�^�[ win
		System.out.println(a1.race(a3)); 	// �`�[�^�[ win
		
		// �n
		System.out.println(a2.getSpeed());	// 80
		System.out.println(a2.getName());	// �n
		System.out.println(a2.race(a1)); 	// �n lose
		System.out.println(a2.race(a2)); 	// draw
		System.out.println(a2.race(a3)); 	// �n win
		
		// Lion
		System.out.println(a3.getSpeed());	// 60
		System.out.println(a3.getName());	// ���C�I��
		System.out.println(a3.race(a1)); 	// ���C�I�� lose
		System.out.println(a3.race(a2)); 	// ���C�I�� lose
		System.out.println(a3.race(a3)); 	// draw
	}
}
