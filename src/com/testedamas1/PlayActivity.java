package com.testedamas1;

import java.util.Vector;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.testedamas1.dominio.Casa;
import com.testedamas1.dominio.Jogada;
import com.testedamas1.dominio.Jogo;
import com.testedamas1.dominio.Tabuleiro;

public class PlayActivity extends Activity implements OnClickListener{

	Jogo jogo = new Jogo();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play);
		
		Button backButton = (Button) this.findViewById(R.id.buttonback);
		backButton.setOnClickListener(this);
		backButton.setEnabled(false);
		backButton.setVisibility(View.INVISIBLE);
		
		TextView textGO = (TextView) this.findViewById(R.id.textGO);
		textGO.setText(jogo.getInstrucaoEstado());
		//textGO.setEnabled(false);
		/*Button quitButton = (Button) this.findViewById(R.id.buttonback);
		backButton.setOnClickListener(this);
		backButton.setEnabled(false);*/
		
		ImageButton boardButton;
		//= (ImageButton) this.findViewById(R.id.board_button00);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button01);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button02);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button03);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button04);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button05);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button06);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button07);
		boardButton.setOnClickListener(this);
		
		boardButton = (ImageButton) this.findViewById(R.id.board_button10);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button11);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button12);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button13);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button14);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button15);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button16);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button17);
		//boardButton.setOnClickListener(this);
		
		//boardButton = (ImageButton) this.findViewById(R.id.board_button20);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button21);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button22);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button23);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button24);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button25);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button26);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button27);
		boardButton.setOnClickListener(this);
		
		boardButton = (ImageButton) this.findViewById(R.id.board_button30);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button31);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button32);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button33);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button34);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button35);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button36);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button37);
		//boardButton.setOnClickListener(this);
		
		//boardButton = (ImageButton) this.findViewById(R.id.board_button40);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button41);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button42);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button43);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button44);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button45);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button46);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button47);
		boardButton.setOnClickListener(this);
		
		boardButton = (ImageButton) this.findViewById(R.id.board_button50);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button51);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button52);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button53);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button54);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button55);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button56);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button57);
		//boardButton.setOnClickListener(this);
		
		//boardButton = (ImageButton) this.findViewById(R.id.board_button60);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button61);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button62);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button63);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button64);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button65);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button66);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button67);
		boardButton.setOnClickListener(this);
		
		boardButton = (ImageButton) this.findViewById(R.id.board_button70);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button71);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button72);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button73);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button74);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button75);
		//boardButton.setOnClickListener(this);
		boardButton = (ImageButton) this.findViewById(R.id.board_button76);
		boardButton.setOnClickListener(this);
		//boardButton = (ImageButton) this.findViewById(R.id.board_button77);
		//boardButton.setOnClickListener(this);
		TextView textView1 = (TextView) this.findViewById(R.id.current_player_pawn_captured);
		textView1.setText(String.valueOf(jogo.getNumPecas1()));
		TextView textView2 = (TextView) this.findViewById(R.id.opposing_player_pawn_captured);
		textView2.setText(String.valueOf(jogo.getNumPecas2()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.play, menu);
		return true;
	}
	
	private void reStartGame() {
		Intent launchDisplay = new Intent(this, MainActivity.class);
		startActivity(launchDisplay);
		this.finish();
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		if(view.getId() == R.id.buttonback){
			this.reStartGame();
		}
		else if(jogo.getEstadoJogo() == 0){
			switch (view.getId()) {
				case R.id.board_button00:
					this.AtivarCasa1(0,0);
					break;
				case R.id.board_button01:
					this.AtivarCasa1(0,1);
					break;
				case R.id.board_button02:
					this.AtivarCasa1(0,2);
					break;
				case R.id.board_button03:
					this.AtivarCasa1(0,3);
					break;
				case R.id.board_button04:
					this.AtivarCasa1(0,4);
					break;
				case R.id.board_button05:
					this.AtivarCasa1(0,5);
					break;
				case R.id.board_button06:
					this.AtivarCasa1(0,6);
					break;
				case R.id.board_button07:
					this.AtivarCasa1(0,7);
					break;
					
				case R.id.board_button10:
					this.AtivarCasa1(1,0);
					break;
				case R.id.board_button11:
					this.AtivarCasa1(1,1);
					break;
				case R.id.board_button12:
					this.AtivarCasa1(1,2);
					break;
				case R.id.board_button13:
					this.AtivarCasa1(1,3);
					break;
				case R.id.board_button14:
					this.AtivarCasa1(1,4);
					break;
				case R.id.board_button15:
					this.AtivarCasa1(1,5);
					break;
				case R.id.board_button16:
					this.AtivarCasa1(1,6);
					break;
				case R.id.board_button17:
					this.AtivarCasa1(1,7);
					break;
				
				case R.id.board_button20:
					this.AtivarCasa1(2,0);
					break;
				case R.id.board_button21:
					this.AtivarCasa1(2,1);
					break;
				case R.id.board_button22:
					this.AtivarCasa1(2,2);
					break;
				case R.id.board_button23:
					this.AtivarCasa1(2,3);
					break;
				case R.id.board_button24:
					this.AtivarCasa1(2,4);
					break;
				case R.id.board_button25:
					this.AtivarCasa1(2,5);
					break;
				case R.id.board_button26:
					this.AtivarCasa1(2,6);
					break;
				case R.id.board_button27:
					this.AtivarCasa1(2,7);
					break;
					
				case R.id.board_button30:
					this.AtivarCasa1(3,0);
					break;
				case R.id.board_button31:
					this.AtivarCasa1(3,1);
					break;
				case R.id.board_button32:
					this.AtivarCasa1(3,2);
					break;
				case R.id.board_button33:
					this.AtivarCasa1(3,3);
					break;
				case R.id.board_button34:
					this.AtivarCasa1(3,4);
					break;
				case R.id.board_button35:
					this.AtivarCasa1(3,5);
					break;
				case R.id.board_button36:
					this.AtivarCasa1(3,6);
					break;
				case R.id.board_button37:
					this.AtivarCasa1(3,7);
					break;
					
				case R.id.board_button40:
					this.AtivarCasa1(4,0);
					break;
				case R.id.board_button41:
					this.AtivarCasa1(4,1);
					break;
				case R.id.board_button42:
					this.AtivarCasa1(4,2);
					break;
				case R.id.board_button43:
					this.AtivarCasa1(4,3);
					break;
				case R.id.board_button44:
					this.AtivarCasa1(4,4);
					break;
				case R.id.board_button45:
					this.AtivarCasa1(4,5);
					break;
				case R.id.board_button46:
					this.AtivarCasa1(4,6);
					break;
				case R.id.board_button47:
					this.AtivarCasa1(4,7);
					break;
					
				case R.id.board_button50:
					this.AtivarCasa1(5,0);
					break;
				case R.id.board_button51:
					this.AtivarCasa1(5,1);
					break;
				case R.id.board_button52:
					this.AtivarCasa1(5,2);
					break;
				case R.id.board_button53:
					this.AtivarCasa1(5,3);
					break;
				case R.id.board_button54:
					this.AtivarCasa1(5,4);
					break;
				case R.id.board_button55:
					this.AtivarCasa1(5,5);
					break;
				case R.id.board_button56:
					this.AtivarCasa1(5,6);
					break;
				case R.id.board_button57:
					this.AtivarCasa1(5,7);
					break;
					
				case R.id.board_button60:
					this.AtivarCasa1(6,0);
					break;
				case R.id.board_button61:
					this.AtivarCasa1(6,1);
					break;
				case R.id.board_button62:
					this.AtivarCasa1(6,2);
					break;
				case R.id.board_button63:
					this.AtivarCasa1(6,3);
					break;
				case R.id.board_button64:
					this.AtivarCasa1(6,4);
					break;
				case R.id.board_button65:
					this.AtivarCasa1(6,5);
					break;
				case R.id.board_button66:
					this.AtivarCasa1(6,6);
					break;
				case R.id.board_button67:
					this.AtivarCasa1(6,7);
					break;
					
				case R.id.board_button70:
					this.AtivarCasa1(7,0);
					break;
				case R.id.board_button71:
					this.AtivarCasa1(7,1);
					break;
				case R.id.board_button72:
					this.AtivarCasa1(7,2);
					break;
				case R.id.board_button73:
					this.AtivarCasa1(7,3);
					break;
				case R.id.board_button74:
					this.AtivarCasa1(7,4);
					break;
				case R.id.board_button75:
					this.AtivarCasa1(7,5);
					break;
				case R.id.board_button76:
					this.AtivarCasa1(7,6);
					break;
				case R.id.board_button77:
					this.AtivarCasa1(7,7);
					break;
			};
		}
		else if(jogo.getEstadoJogo() == 1){
			switch (view.getId()) {
			case R.id.board_button00:
				this.MovimentarPara1(0,0);
				break;
			case R.id.board_button01:
				this.MovimentarPara1(0,1);
				break;
			case R.id.board_button02:
				this.MovimentarPara1(0,2);
				break;
			case R.id.board_button03:
				this.MovimentarPara1(0,3);
				break;
			case R.id.board_button04:
				this.MovimentarPara1(0,4);
				break;
			case R.id.board_button05:
				this.MovimentarPara1(0,5);
				break;
			case R.id.board_button06:
				this.MovimentarPara1(0,6);
				break;
			case R.id.board_button07:
				this.MovimentarPara1(0,7);
				break;
				
			case R.id.board_button10:
				this.MovimentarPara1(1,0);
				break;
			case R.id.board_button11:
				this.MovimentarPara1(1,1);
				break;
			case R.id.board_button12:
				this.MovimentarPara1(1,2);
				break;
			case R.id.board_button13:
				this.MovimentarPara1(1,3);
				break;
			case R.id.board_button14:
				this.MovimentarPara1(1,4);
				break;
			case R.id.board_button15:
				this.MovimentarPara1(1,5);
				break;
			case R.id.board_button16:
				this.MovimentarPara1(1,6);
				break;
			case R.id.board_button17:
				this.MovimentarPara1(1,7);
				break;
			
			case R.id.board_button20:
				this.MovimentarPara1(2,0);
				break;
			case R.id.board_button21:
				this.MovimentarPara1(2,1);
				break;
			case R.id.board_button22:
				this.MovimentarPara1(2,2);
				break;
			case R.id.board_button23:
				this.MovimentarPara1(2,3);
				break;
			case R.id.board_button24:
				this.MovimentarPara1(2,4);
				break;
			case R.id.board_button25:
				this.MovimentarPara1(2,5);
				break;
			case R.id.board_button26:
				this.MovimentarPara1(2,6);
				break;
			case R.id.board_button27:
				this.MovimentarPara1(2,7);
				break;
				
			case R.id.board_button30:
				this.MovimentarPara1(3,0);
				break;
			case R.id.board_button31:
				this.MovimentarPara1(3,1);
				break;
			case R.id.board_button32:
				this.MovimentarPara1(3,2);
				break;
			case R.id.board_button33:
				this.MovimentarPara1(3,3);
				break;
			case R.id.board_button34:
				this.MovimentarPara1(3,4);
				break;
			case R.id.board_button35:
				this.MovimentarPara1(3,5);
				break;
			case R.id.board_button36:
				this.MovimentarPara1(3,6);
				break;
			case R.id.board_button37:
				this.MovimentarPara1(3,7);
				break;
				
			case R.id.board_button40:
				this.MovimentarPara1(4,0);
				break;
			case R.id.board_button41:
				this.MovimentarPara1(4,1);
				break;
			case R.id.board_button42:
				this.MovimentarPara1(4,2);
				break;
			case R.id.board_button43:
				this.MovimentarPara1(4,3);
				break;
			case R.id.board_button44:
				this.MovimentarPara1(4,4);
				break;
			case R.id.board_button45:
				this.MovimentarPara1(4,5);
				break;
			case R.id.board_button46:
				this.MovimentarPara1(4,6);
				break;
			case R.id.board_button47:
				this.MovimentarPara1(4,7);
				break;
				
			case R.id.board_button50:
				this.MovimentarPara1(5,0);
				break;
			case R.id.board_button51:
				this.MovimentarPara1(5,1);
				break;
			case R.id.board_button52:
				this.MovimentarPara1(5,2);
				break;
			case R.id.board_button53:
				this.MovimentarPara1(5,3);
				break;
			case R.id.board_button54:
				this.MovimentarPara1(5,4);
				break;
			case R.id.board_button55:
				this.MovimentarPara1(5,5);
				break;
			case R.id.board_button56:
				this.MovimentarPara1(5,6);
				break;
			case R.id.board_button57:
				this.MovimentarPara1(5,7);
				break;
				
			case R.id.board_button60:
				this.MovimentarPara1(6,0);
				break;
			case R.id.board_button61:
				this.MovimentarPara1(6,1);
				break;
			case R.id.board_button62:
				this.MovimentarPara1(6,2);
				break;
			case R.id.board_button63:
				this.MovimentarPara1(6,3);
				break;
			case R.id.board_button64:
				this.MovimentarPara1(6,4);
				break;
			case R.id.board_button65:
				this.MovimentarPara1(6,5);
				break;
			case R.id.board_button66:
				this.MovimentarPara1(6,6);
				break;
			case R.id.board_button67:
				this.MovimentarPara1(6,7);
				break;
				
			case R.id.board_button70:
				this.MovimentarPara1(7,0);
				break;
			case R.id.board_button71:
				this.MovimentarPara1(7,1);
				break;
			case R.id.board_button72:
				this.MovimentarPara1(7,2);
				break;
			case R.id.board_button73:
				this.MovimentarPara1(7,3);
				break;
			case R.id.board_button74:
				this.MovimentarPara1(7,4);
				break;
			case R.id.board_button75:
				this.MovimentarPara1(7,5);
				break;
			case R.id.board_button76:
				this.MovimentarPara1(7,6);
				break;
			case R.id.board_button77:
				this.MovimentarPara1(7,7);
				break;
			};
		}
		else if(jogo.getEstadoJogo() == 2){
			switch (view.getId()) {
				case R.id.board_button00:
					this.AtivarCasa2(0,0);
					break;
				case R.id.board_button01:
					this.AtivarCasa2(0,1);
					break;
				case R.id.board_button02:
					this.AtivarCasa2(0,2);
					break;
				case R.id.board_button03:
					this.AtivarCasa2(0,3);
					break;
				case R.id.board_button04:
					this.AtivarCasa2(0,4);
					break;
				case R.id.board_button05:
					this.AtivarCasa2(0,5);
					break;
				case R.id.board_button06:
					this.AtivarCasa2(0,6);
					break;
				case R.id.board_button07:
					this.AtivarCasa2(0,7);
					break;
					
				case R.id.board_button10:
					this.AtivarCasa2(1,0);
					break;
				case R.id.board_button11:
					this.AtivarCasa2(1,1);
					break;
				case R.id.board_button12:
					this.AtivarCasa2(1,2);
					break;
				case R.id.board_button13:
					this.AtivarCasa2(1,3);
					break;
				case R.id.board_button14:
					this.AtivarCasa2(1,4);
					break;
				case R.id.board_button15:
					this.AtivarCasa2(1,5);
					break;
				case R.id.board_button16:
					this.AtivarCasa2(1,6);
					break;
				case R.id.board_button17:
					this.AtivarCasa2(1,7);
					break;
				
				case R.id.board_button20:
					this.AtivarCasa2(2,0);
					break;
				case R.id.board_button21:
					this.AtivarCasa2(2,1);
					break;
				case R.id.board_button22:
					this.AtivarCasa2(2,2);
					break;
				case R.id.board_button23:
					this.AtivarCasa2(2,3);
					break;
				case R.id.board_button24:
					this.AtivarCasa2(2,4);
					break;
				case R.id.board_button25:
					this.AtivarCasa2(2,5);
					break;
				case R.id.board_button26:
					this.AtivarCasa2(2,6);
					break;
				case R.id.board_button27:
					this.AtivarCasa2(2,7);
					break;
					
				case R.id.board_button30:
					this.AtivarCasa2(3,0);
					break;
				case R.id.board_button31:
					this.AtivarCasa2(3,1);
					break;
				case R.id.board_button32:
					this.AtivarCasa2(3,2);
					break;
				case R.id.board_button33:
					this.AtivarCasa2(3,3);
					break;
				case R.id.board_button34:
					this.AtivarCasa2(3,4);
					break;
				case R.id.board_button35:
					this.AtivarCasa2(3,5);
					break;
				case R.id.board_button36:
					this.AtivarCasa2(3,6);
					break;
				case R.id.board_button37:
					this.AtivarCasa2(3,7);
					break;
					
				case R.id.board_button40:
					this.AtivarCasa2(4,0);
					break;
				case R.id.board_button41:
					this.AtivarCasa2(4,1);
					break;
				case R.id.board_button42:
					this.AtivarCasa2(4,2);
					break;
				case R.id.board_button43:
					this.AtivarCasa2(4,3);
					break;
				case R.id.board_button44:
					this.AtivarCasa2(4,4);
					break;
				case R.id.board_button45:
					this.AtivarCasa2(4,5);
					break;
				case R.id.board_button46:
					this.AtivarCasa2(4,6);
					break;
				case R.id.board_button47:
					this.AtivarCasa2(4,7);
					break;
					
				case R.id.board_button50:
					this.AtivarCasa2(5,0);
					break;
				case R.id.board_button51:
					this.AtivarCasa2(5,1);
					break;
				case R.id.board_button52:
					this.AtivarCasa2(5,2);
					break;
				case R.id.board_button53:
					this.AtivarCasa2(5,3);
					break;
				case R.id.board_button54:
					this.AtivarCasa2(5,4);
					break;
				case R.id.board_button55:
					this.AtivarCasa2(5,5);
					break;
				case R.id.board_button56:
					this.AtivarCasa2(5,6);
					break;
				case R.id.board_button57:
					this.AtivarCasa2(5,7);
					break;
					
				case R.id.board_button60:
					this.AtivarCasa2(6,0);
					break;
				case R.id.board_button61:
					this.AtivarCasa2(6,1);
					break;
				case R.id.board_button62:
					this.AtivarCasa2(6,2);
					break;
				case R.id.board_button63:
					this.AtivarCasa2(6,3);
					break;
				case R.id.board_button64:
					this.AtivarCasa2(6,4);
					break;
				case R.id.board_button65:
					this.AtivarCasa2(6,5);
					break;
				case R.id.board_button66:
					this.AtivarCasa2(6,6);
					break;
				case R.id.board_button67:
					this.AtivarCasa2(6,7);
					break;
					
				case R.id.board_button70:
					this.AtivarCasa2(7,0);
					break;
				case R.id.board_button71:
					this.AtivarCasa2(7,1);
					break;
				case R.id.board_button72:
					this.AtivarCasa2(7,2);
					break;
				case R.id.board_button73:
					this.AtivarCasa2(7,3);
					break;
				case R.id.board_button74:
					this.AtivarCasa2(7,4);
					break;
				case R.id.board_button75:
					this.AtivarCasa2(7,5);
					break;
				case R.id.board_button76:
					this.AtivarCasa2(7,6);
					break;
				case R.id.board_button77:
					this.AtivarCasa2(7,7);
					break;
			};
		}
		else if(jogo.getEstadoJogo() == 3){
			switch (view.getId()) {
			case R.id.board_button00:
				this.MovimentarPara2(0,0);
				break;
			case R.id.board_button01:
				this.MovimentarPara2(0,1);
				break;
			case R.id.board_button02:
				this.MovimentarPara2(0,2);
				break;
			case R.id.board_button03:
				this.MovimentarPara2(0,3);
				break;
			case R.id.board_button04:
				this.MovimentarPara2(0,4);
				break;
			case R.id.board_button05:
				this.MovimentarPara2(0,5);
				break;
			case R.id.board_button06:
				this.MovimentarPara2(0,6);
				break;
			case R.id.board_button07:
				this.MovimentarPara2(0,7);
				break;
				
			case R.id.board_button10:
				this.MovimentarPara2(1,0);
				break;
			case R.id.board_button11:
				this.MovimentarPara2(1,1);
				break;
			case R.id.board_button12:
				this.MovimentarPara2(1,2);
				break;
			case R.id.board_button13:
				this.MovimentarPara2(1,3);
				break;
			case R.id.board_button14:
				this.MovimentarPara2(1,4);
				break;
			case R.id.board_button15:
				this.MovimentarPara2(1,5);
				break;
			case R.id.board_button16:
				this.MovimentarPara2(1,6);
				break;
			case R.id.board_button17:
				this.MovimentarPara2(1,7);
				break;
			
			case R.id.board_button20:
				this.MovimentarPara2(2,0);
				break;
			case R.id.board_button21:
				this.MovimentarPara2(2,1);
				break;
			case R.id.board_button22:
				this.MovimentarPara2(2,2);
				break;
			case R.id.board_button23:
				this.MovimentarPara2(2,3);
				break;
			case R.id.board_button24:
				this.MovimentarPara2(2,4);
				break;
			case R.id.board_button25:
				this.MovimentarPara2(2,5);
				break;
			case R.id.board_button26:
				this.MovimentarPara2(2,6);
				break;
			case R.id.board_button27:
				this.MovimentarPara2(2,7);
				break;
				
			case R.id.board_button30:
				this.MovimentarPara2(3,0);
				break;
			case R.id.board_button31:
				this.MovimentarPara2(3,1);
				break;
			case R.id.board_button32:
				this.MovimentarPara2(3,2);
				break;
			case R.id.board_button33:
				this.MovimentarPara2(3,3);
				break;
			case R.id.board_button34:
				this.MovimentarPara2(3,4);
				break;
			case R.id.board_button35:
				this.MovimentarPara2(3,5);
				break;
			case R.id.board_button36:
				this.MovimentarPara2(3,6);
				break;
			case R.id.board_button37:
				this.MovimentarPara2(3,7);
				break;
				
			case R.id.board_button40:
				this.MovimentarPara2(4,0);
				break;
			case R.id.board_button41:
				this.MovimentarPara2(4,1);
				break;
			case R.id.board_button42:
				this.MovimentarPara2(4,2);
				break;
			case R.id.board_button43:
				this.MovimentarPara2(4,3);
				break;
			case R.id.board_button44:
				this.MovimentarPara2(4,4);
				break;
			case R.id.board_button45:
				this.MovimentarPara2(4,5);
				break;
			case R.id.board_button46:
				this.MovimentarPara2(4,6);
				break;
			case R.id.board_button47:
				this.MovimentarPara2(4,7);
				break;
				
			case R.id.board_button50:
				this.MovimentarPara2(5,0);
				break;
			case R.id.board_button51:
				this.MovimentarPara2(5,1);
				break;
			case R.id.board_button52:
				this.MovimentarPara2(5,2);
				break;
			case R.id.board_button53:
				this.MovimentarPara2(5,3);
				break;
			case R.id.board_button54:
				this.MovimentarPara2(5,4);
				break;
			case R.id.board_button55:
				this.MovimentarPara2(5,5);
				break;
			case R.id.board_button56:
				this.MovimentarPara2(5,6);
				break;
			case R.id.board_button57:
				this.MovimentarPara2(5,7);
				break;
				
			case R.id.board_button60:
				this.MovimentarPara2(6,0);
				break;
			case R.id.board_button61:
				this.MovimentarPara2(6,1);
				break;
			case R.id.board_button62:
				this.MovimentarPara2(6,2);
				break;
			case R.id.board_button63:
				this.MovimentarPara2(6,3);
				break;
			case R.id.board_button64:
				this.MovimentarPara2(6,4);
				break;
			case R.id.board_button65:
				this.MovimentarPara2(6,5);
				break;
			case R.id.board_button66:
				this.MovimentarPara2(6,6);
				break;
			case R.id.board_button67:
				this.MovimentarPara2(6,7);
				break;
				
			case R.id.board_button70:
				this.MovimentarPara2(7,0);
				break;
			case R.id.board_button71:
				this.MovimentarPara2(7,1);
				break;
			case R.id.board_button72:
				this.MovimentarPara2(7,2);
				break;
			case R.id.board_button73:
				this.MovimentarPara2(7,3);
				break;
			case R.id.board_button74:
				this.MovimentarPara2(7,4);
				break;
			case R.id.board_button75:
				this.MovimentarPara2(7,5);
				break;
			case R.id.board_button76:
				this.MovimentarPara2(7,6);
				break;
			case R.id.board_button77:
				this.MovimentarPara2(7,7);
				break;
			};
		}
		else{
			
		}
	}
	
	public void AtivarCasa1(int linha, int coluna){
		if(jogo.getTabuleiro().getCasas()[linha][coluna].getPeca() != null){
			if(jogo.getTabuleiro().getCasas()[linha][coluna].getPeca().getJogador() == jogo.getJogadores()[0]){
				//jogo.setCasaAtual(jogo.getTabuleiro().getCasas()[linha][coluna]);
				Vector<Jogada> jogadas = jogo.ApresentarDestinoMovimento(linha,coluna);
				ImageButton boardButton;
				for(int i = 0; i < jogadas.size(); i++){
					Casa casa = jogadas.get(i).getCasaDestino();
					boardButton = (ImageButton) this.findViewById(ConverteCasaemID(casa.getLinha(),casa.getColuna()));
					boardButton.setBackgroundResource(R.drawable.button_focused);
					jogo.setEstadoJogo(1);
					//TextView textGO = (TextView) this.findViewById(R.id.textGO);
					//textGO.setText("Vez do Jogador 1 : Escolha o destino da peça a ser movimentada");
				}
			}
		}
		TextView textGO = (TextView) this.findViewById(R.id.textGO);
		textGO.setText(jogo.getInstrucaoEstado());
	}
	
	
	public void MovimentarPara1(int linha, int coluna){
		if(jogo.getCasaAtual().getPeca().getJogador() == jogo.getJogadores()[0]){
			int n = jogo.getCasaAtual().getPeca().getJogadas().size();
			//TextView textGO = (TextView) this.findViewById(R.id.textGO);
			//textGO.setText("Linha: " + jogo.getCasaAtual().getPeca().getJogadas().get(0).getCasaDestino().getLinha() + " Coluna: " + jogo.getCasaAtual().getPeca().getJogadas().get(0).getCasaDestino().getColuna());
			if(jogo.getCasaAtual().getLinha() == linha && jogo.getCasaAtual().getColuna() == coluna){
				//Apagar Verde
				Vector<Jogada> jogadas = jogo.ApresentarDestinoMovimento(linha,coluna);
				ImageButton boardButton;
				for(int j = 0; j < jogadas.size(); j++){
					Casa casa = jogadas.get(j).getCasaDestino();
					boardButton = (ImageButton) this.findViewById(ConverteCasaemID(casa.getLinha(),casa.getColuna()));
					boardButton.setBackgroundResource(R.drawable.play);
					jogo.setEstadoJogo(0);
					//TextView textGO = (TextView) this.findViewById(R.id.textGO);
					//textGO.setText("Vez do Jogador 1 : Escolha o destino da peça a ser movimentada");
				}
			}
			else{
				for(int i = 0; i < n; i++){
					if(jogo.getTabuleiro().getCasas()[linha][coluna] == jogo.getCasaAtual().getPeca().getJogadas().get(i).getCasaDestino()){
						ImageButton boardButton;
						for(int j = 0; j < n; j++){
							boardButton = (ImageButton) this.findViewById(ConverteCasaemID(jogo.getCasaAtual().getPeca().getJogadas().get(j).getCasaDestino().getLinha(),jogo.getCasaAtual().getPeca().getJogadas().get(j).getCasaDestino().getColuna()));
							boardButton.setBackgroundResource(R.drawable.play);
						}
						Casa casaAtacada = jogo.getCasaAtual().getPeca().getJogadas().get(i).getCasaAtacada();
						if(casaAtacada != null){
							casaAtacada.setPeca(null);
							
							boardButton = (ImageButton) this.findViewById(ConverteCasaemID(casaAtacada.getLinha(),casaAtacada.getColuna()));
							boardButton.setImageResource(android.R.color.transparent);
							
						}
						jogo.MovimentarPara(linha, coluna);
						boardButton = (ImageButton) this.findViewById(ConverteCasaemID(jogo.getCasaAtual().getLinha(),jogo.getCasaAtual().getColuna()));
						boardButton.setImageResource(android.R.color.transparent);
						boardButton = (ImageButton) this.findViewById(ConverteCasaemID(linha,coluna));
						if(jogo.getTabuleiro().getCasas()[linha][coluna].getPeca().getJogador() == jogo.getJogadores()[1]){
							if(!jogo.getTabuleiro().getCasas()[linha][coluna].getPeca().isEhDama())
								boardButton.setImageResource(R.drawable.defend_pawn);
							else
								boardButton.setImageResource(R.drawable.defend_king);
						}
						else{
							if(!jogo.getTabuleiro().getCasas()[linha][coluna].getPeca().isEhDama())
								boardButton.setImageResource(R.drawable.attack_pawn);
							else
								boardButton.setImageResource(R.drawable.attack_king);
						}
						VerificarDama(linha,coluna);
						jogo.setEstadoJogo(2);
						break;
					}
				}
			}	
		}
		//Mudar Texto
		TextView textView1 = (TextView) this.findViewById(R.id.current_player_pawn_captured);
		textView1.setText(String.valueOf(jogo.getNumPecas1()));
		TextView textView2 = (TextView) this.findViewById(R.id.opposing_player_pawn_captured);
		textView2.setText(String.valueOf(jogo.getNumPecas2()));
		if(jogo.GameOver()!=0){
			jogo.setEstadoJogo(4);
			Button backButton = (Button) this.findViewById(R.id.buttonback);
			backButton.setOnClickListener(this);
			backButton.setEnabled(true);
			backButton.setVisibility(View.VISIBLE);
			
			//TextView textGO = (TextView) this.findViewById(R.id.textGO);
			/*if(jogo.GameOver() == 1){
				textGO.setText("Jogador 1 Venceu !!!");
			}
			else{
				textGO.setText("Jogador 2 Venceu !!!");
			}*/
			//textGO.setEnabled(true);
		}
		TextView textGO = (TextView) this.findViewById(R.id.textGO);
		textGO.setText(jogo.getInstrucaoEstado());
	}
	
	public void VerificarDama(int linha, int coluna){
		if(jogo.VerificarDama(linha, coluna)){
			ImageButton boardButton = (ImageButton) this.findViewById(ConverteCasaemID(linha,coluna));
			if(jogo.getTabuleiro().getCasas()[linha][coluna].getPeca().getJogador() == jogo.getJogadores()[1]){
				boardButton.setImageResource(R.drawable.defend_king);
			}
			else{
				boardButton.setImageResource(R.drawable.attack_king);
			}
		}
		
	}
	
	public void AtivarCasa2(int linha, int coluna){
		if(jogo.getTabuleiro().getCasas()[linha][coluna].getPeca() != null){
			if(jogo.getTabuleiro().getCasas()[linha][coluna].getPeca().getJogador() == jogo.getJogadores()[1]){
				jogo.setCasaAtual(jogo.getTabuleiro().getCasas()[linha][coluna]);
				Vector<Jogada> jogadas = jogo.ApresentarDestinoMovimento(linha,coluna);
				ImageButton boardButton;
				for(int i = 0; i < jogadas.size(); i++){
					Casa casa = jogadas.get(i).getCasaDestino();
					boardButton = (ImageButton) this.findViewById(ConverteCasaemID(casa.getLinha(),casa.getColuna()));
					boardButton.setBackgroundResource(R.drawable.button_focused);
					jogo.setEstadoJogo(3);
				}
			}
		}
		TextView textGO = (TextView) this.findViewById(R.id.textGO);
		textGO.setText(jogo.getInstrucaoEstado());
	}
	
	public void MovimentarPara2(int linha, int coluna){
		if(jogo.getCasaAtual().getPeca().getJogador() == jogo.getJogadores()[1]){
			int n = jogo.getCasaAtual().getPeca().getJogadas().size();
			/*TextView textGO = (TextView) this.findViewById(R.id.textGO);
			textGO.setText("Linha: " + jogo.getTabuleiro().getCasas()[linha][coluna].getLinha() + " Coluna: " + jogo.getTabuleiro().getCasas()[linha][coluna].getColuna());
			textGO.setText("Linha: " + jogo.getCasaAtual().getPeca().getJogadas().get(0).getCasaDestino().getLinha() + " Coluna: " + jogo.getCasaAtual().getPeca().getJogadas().get(0).getCasaDestino().getColuna());*/
			if(jogo.getCasaAtual().getLinha() == linha && jogo.getCasaAtual().getColuna() == coluna){
				//Apagar Verde
				Vector<Jogada> jogadas = jogo.ApresentarDestinoMovimento(linha,coluna);
				ImageButton boardButton;
				for(int j = 0; j < jogadas.size(); j++){
					Casa casa = jogadas.get(j).getCasaDestino();
					boardButton = (ImageButton) this.findViewById(ConverteCasaemID(casa.getLinha(),casa.getColuna()));
					boardButton.setBackgroundResource(R.drawable.play);
					jogo.setEstadoJogo(2);
				}
			}
			else{
				for(int i = 0; i < n; i++){
					if(jogo.getTabuleiro().getCasas()[linha][coluna] == jogo.getCasaAtual().getPeca().getJogadas().get(i).getCasaDestino()){
						ImageButton boardButton;
						for(int j = 0; j < n; j++){
							boardButton = (ImageButton) this.findViewById(ConverteCasaemID(jogo.getCasaAtual().getPeca().getJogadas().get(j).getCasaDestino().getLinha(),jogo.getCasaAtual().getPeca().getJogadas().get(j).getCasaDestino().getColuna()));
							boardButton.setBackgroundResource(R.drawable.play);
						}
						Casa casaAtacada = jogo.getCasaAtual().getPeca().getJogadas().get(i).getCasaAtacada();
						if(casaAtacada != null){
							casaAtacada.setPeca(null);
							
							boardButton = (ImageButton) this.findViewById(ConverteCasaemID(casaAtacada.getLinha(),casaAtacada.getColuna()));
							boardButton.setImageResource(android.R.color.transparent);
							
						}
						jogo.MovimentarPara(linha, coluna);
						boardButton = (ImageButton) this.findViewById(ConverteCasaemID(jogo.getCasaAtual().getLinha(),jogo.getCasaAtual().getColuna()));
						boardButton.setImageResource(android.R.color.transparent);
						boardButton = (ImageButton) this.findViewById(ConverteCasaemID(linha,coluna));
						
						if(jogo.getTabuleiro().getCasas()[linha][coluna].getPeca().getJogador() == jogo.getJogadores()[1]){
							if(!jogo.getTabuleiro().getCasas()[linha][coluna].getPeca().isEhDama())
								boardButton.setImageResource(R.drawable.defend_pawn);
							else
								boardButton.setImageResource(R.drawable.defend_king);
						}
						else{
							if(!jogo.getTabuleiro().getCasas()[linha][coluna].getPeca().isEhDama())
								boardButton.setImageResource(R.drawable.attack_pawn);
							else
								boardButton.setImageResource(R.drawable.attack_king);
						}
						VerificarDama(linha,coluna);
						jogo.setEstadoJogo(0);
						break;
					}
				}
			}			
		}
		//Mudar Texto
		TextView textView1 = (TextView) this.findViewById(R.id.current_player_pawn_captured);
		textView1.setText(String.valueOf(jogo.getNumPecas1()));
		TextView textView2 = (TextView) this.findViewById(R.id.opposing_player_pawn_captured);
		textView2.setText(String.valueOf(jogo.getNumPecas2()));
		if(jogo.GameOver()!=0){
			jogo.setEstadoJogo(4);
			Button backButton = (Button) this.findViewById(R.id.buttonback);
			backButton.setOnClickListener(this);
			backButton.setEnabled(true);
			backButton.setVisibility(View.VISIBLE);
			
			//TextView textGO = (TextView) this.findViewById(R.id.textGO);
			/*if(jogo.GameOver() == 1){
				textGO.setText("Jogador 1 Venceu !!!");
			}
			else{
				textGO.setText("Jogador 2 Venceu !!!");
			}*/
			//textGO.setEnabled(true);
		}
		TextView textGO = (TextView) this.findViewById(R.id.textGO);
		textGO.setText(jogo.getInstrucaoEstado());
	}
	
	public int ConverteCasaemID(int linha, int coluna){
		int id = R.id.board_button11;
		if(linha == 0){
			switch (coluna){
			case 0:
				id = R.id.board_button00;
				break;
			case 1:
				id = R.id.board_button01;
				break;
			case 2:
				id = R.id.board_button02;
				break;
			case 3:
				id = R.id.board_button03;
				break;
			case 4:
				id = R.id.board_button04;
				break;
			case 5:
				id = R.id.board_button05;
				break;
			case 6:
				id = R.id.board_button06;
				break;
			case 7:
				id = R.id.board_button07;
				break;
			};
		}
		else if(linha == 1){
			switch (coluna){
			case 0:
				id = R.id.board_button10;
				break;
			case 1:
				id = R.id.board_button11;
				break;
			case 2:
				id = R.id.board_button12;
				break;
			case 3:
				id = R.id.board_button13;
				break;
			case 4:
				id = R.id.board_button14;
				break;
			case 5:
				id = R.id.board_button15;
				break;
			case 6:
				id = R.id.board_button16;
				break;
			case 7:
				id = R.id.board_button17;
				break;
			};
		}
		else if(linha == 2){
			switch (coluna){
			case 0:
				id = R.id.board_button20;
				break;
			case 1:
				id = R.id.board_button21;
				break;
			case 2:
				id = R.id.board_button22;
				break;
			case 3:
				id = R.id.board_button23;
				break;
			case 4:
				id = R.id.board_button24;
				break;
			case 5:
				id = R.id.board_button25;
				break;
			case 6:
				id = R.id.board_button26;
				break;
			case 7:
				id = R.id.board_button27;
				break;
			};
		}
		else if(linha == 3){
			switch (coluna){
			case 0:
				id = R.id.board_button30;
				break;
			case 1:
				id = R.id.board_button31;
				break;
			case 2:
				id = R.id.board_button32;
				break;
			case 3:
				id = R.id.board_button33;
				break;
			case 4:
				id = R.id.board_button34;
				break;
			case 5:
				id = R.id.board_button35;
				break;
			case 6:
				id = R.id.board_button36;
				break;
			case 7:
				id = R.id.board_button37;
				break;
			};
		}
		else if(linha == 4){
			switch (coluna){
			case 0:
				id = R.id.board_button40;
				break;
			case 1:
				id = R.id.board_button41;
				break;
			case 2:
				id = R.id.board_button42;
				break;
			case 3:
				id = R.id.board_button43;
				break;
			case 4:
				id = R.id.board_button44;
				break;
			case 5:
				id = R.id.board_button45;
				break;
			case 6:
				id = R.id.board_button46;
				break;
			case 7:
				id = R.id.board_button47;
				break;
			};
		}
		else if(linha == 5){
			switch (coluna){
			case 0:
				id = R.id.board_button50;
				break;
			case 1:
				id = R.id.board_button51;
				break;
			case 2:
				id = R.id.board_button52;
				break;
			case 3:
				id = R.id.board_button53;
				break;
			case 4:
				id = R.id.board_button54;
				break;
			case 5:
				id = R.id.board_button55;
				break;
			case 6:
				id = R.id.board_button56;
				break;
			case 7:
				id = R.id.board_button57;
				break;
			};
		}
		else if(linha == 6){
			switch (coluna){
			case 0:
				id = R.id.board_button60;
				break;
			case 1:
				id = R.id.board_button61;
				break;
			case 2:
				id = R.id.board_button62;
				break;
			case 3:
				id = R.id.board_button63;
				break;
			case 4:
				id = R.id.board_button64;
				break;
			case 5:
				id = R.id.board_button65;
				break;
			case 6:
				id = R.id.board_button66;
				break;
			case 7:
				id = R.id.board_button67;
				break;
			};
		}
		else if(linha == 7){
			switch (coluna){
			case 0:
				id = R.id.board_button70;
				break;
			case 1:
				id = R.id.board_button71;
				break;
			case 2:
				id = R.id.board_button72;
				break;
			case 3:
				id = R.id.board_button73;
				break;
			case 4:
				id = R.id.board_button74;
				break;
			case 5:
				id = R.id.board_button75;
				break;
			case 6:
				id = R.id.board_button76;
				break;
			case 7:
				id = R.id.board_button77;
				break;
			};
		}
		return id;
	}

}
