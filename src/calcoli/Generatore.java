package calcoli;

import gui.Informazioni;
import utility.Utility;

public class Generatore {

	private int livPG = Informazioni.getLivPG();
	private int LI = generaLI();
	private double GS = generaGS();
	
	
	 public double generaGS(){
		 int scelta = 0;
		 
			 switch (LI) {
			 case 1: // LIVELLO INCONTRO 1
				 	scelta = Utility.lancio(1,  105);
				        if(scelta >= 1 && scelta <= 15){
				        	GS = 2;
				        	} else if (scelta >= 16 && scelta <= 30) {
				        		GS = 1;
				        		} else if (scelta >= 31 && scelta <= 45) {
				        			GS = 0.5; // GS 1/2
				        			} else if (scelta >= 46 && scelta <= 60) {
				        				GS = 0.33334; // GS 1/3
				        				} else if (scelta >= 61 && scelta <= 75) {
				        					GS = 0.25; // GS 1/4
				        					} else if (scelta >= 76 && scelta <= 90) {
				        						GS = 0.166667; // GS 1/6
				        						} else if (scelta >= 91 && scelta <= 105) {
				        							GS = 0.125; // GS 1/8
				        							}
				        break;
				        
			        case 2: // LIVELLO INCONTRO 2
			        	scelta = Utility.lancio(1,  105);
				        if(scelta >= 1 && scelta <= 15){
				        	GS = 3;
				        	} else if (scelta >= 16 && scelta <= 30) {
				        		GS = 2;
					        	} else if (scelta >= 31 && scelta <= 45) {
					        		GS = 1;
					        		} else if (scelta >= 46 && scelta <= 60) {
					        			GS = 0.5; // GS 1/2
					        			} else if (scelta >= 61 && scelta <= 75) {
					        				GS = 0.33334; // GS 1/3
					        				} else if (scelta >= 76 && scelta <= 90) {
					        					GS = 0.25; // GS 1/4
					        					} else if (scelta >= 91 && scelta <= 105) {
					        						GS = 0.166667; // GS 1/6
					        						}
				        break;
				        
			        case 3: // LIVELLO INCONTRO 3
					 	scelta = Utility.lancio(1,  105);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 4;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 3;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 2; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 1; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 0.5; // GS 1/2
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 0.33334; // GS 1/3
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 0.25; // GS 1/4
					        							}
					        break;
					        
			        case 4: // LIVELLO INCONTRO 4
					 	scelta = Utility.lancio(1,  105);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 5;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 4;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 3; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 2; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 1; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 0.5; // GS 1/2
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 0.33334; // GS 1/3
					        							}
					        break;
					        
			        case 5: // LIVELLO INCONTRO 5
					 	scelta = Utility.lancio(1,  105);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 6;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 5;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 4; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 3; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 2; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 1; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 0.5; // GS 1/2
					        							}
					        break;
					        
			        case 6: // LIVELLO INCONTRO 6
					 	scelta = Utility.lancio(1,  120);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 7;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 6;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 5; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 4; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 3; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 2; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 1; 
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 0.5; // GS 1/2
					        							}
					        break;
					        
			        case 7: // LIVELLO INCONTRO 7
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 8;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 7;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 6; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 5; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 4; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 3; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 2;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 1;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 0.5; // GS 1/2
						        							}
					        break;
					        
			        case 8: // LIVELLO INCONTRO 8
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 9;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 7;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 6; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 5; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 4; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 3; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 2;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 1;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 0.5; // GS 1/2
						        							}
					        break;
					        
			        case 9: // LIVELLO INCONTRO 9
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 10;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 9;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 8; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 7; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 6; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 5; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 4;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 3;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 2; 
						        							}
					        break;
					        
			        case 10: // LIVELLO INCONTRO 10
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 11;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 10;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 9; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 8; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 7; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 6; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 5;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 4;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 3; 
						        							}
					        break;
					        
			        case 11: // LIVELLO INCONTRO 11
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 12;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 11;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 10; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 9; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 8; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 7; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 6;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 5;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 4; 
						        							}
					        break;
					        
			        case 12: // LIVELLO INCONTRO 12
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 13;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 12;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 11; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 10; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 9; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 8; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 7;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 6;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 5; 
						        							}
					        break;
					        
			        case 13: // LIVELLO INCONTRO 13
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 14;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 13;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 12; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 11; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 10; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 9; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 8;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 7;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 6; 
						        							}
					        break;
					        
			        case 14: // LIVELLO INCONTRO 14
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 15;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 14;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 13; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 12; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 11; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 10; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 9;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 8;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 7; 
						        							}
					        break;
					        
			        case 15: // LIVELLO INCONTRO 15
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 16;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 15;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 14; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 13; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 12; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 11; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 10;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 9;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 8; 
						        							}
					        break;
					        
			        case 16: // LIVELLO INCONTRO 16
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 17;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 16;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 15; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 14; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 13; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 12; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 11;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 10;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 9; 
						        							}
					        break;
					        
			        case 17: // LIVELLO INCONTRO 17
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 18;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 17;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 16; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 15; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 14; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 13; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 12;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 11;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 10; 
						        							}
					        break;
					        
			        case 18: // LIVELLO INCONTRO 18
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 19;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 18;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 17; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 16; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 15; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 14; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 13;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 12;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 11; 
						        							}
					        break;
					        
			        case 19: // LIVELLO INCONTRO 19
					 	scelta = Utility.lancio(1,  135);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 20;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 19;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 18; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 17; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 16; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 15; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 14;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 13;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 12; 
						        							}
					        break;
					        
			        case 20: // LIVELLO INCONTRO 20
					 	scelta = Utility.lancio(1,  155);
					        if(scelta >= 1 && scelta <= 15){
					        	GS = 23;
					        	} else if (scelta >= 16 && scelta <= 30) {
					        		GS = 22;
					        		} else if (scelta >= 31 && scelta <= 45) {
					        			GS = 21; 
					        			} else if (scelta >= 46 && scelta <= 60) {
					        				GS = 20; 
					        				} else if (scelta >= 61 && scelta <= 75) {
					        					GS = 19; 
					        					} else if (scelta >= 76 && scelta <= 90) {
					        						GS = 18; 
					        						} else if (scelta >= 91 && scelta <= 105) {
					        							GS = 17;
					        							} else if (scelta >= 106 && scelta <= 120) {
						        							GS = 16;
						        							} else if (scelta >= 121 && scelta <= 135) {
							        							GS = 15; 
							        							}else if (scelta >= 136 && scelta <= 140) {
								        							GS = 14;
								        							} else if (scelta >= 141 && scelta <= 155) {
									        							GS = 13; 
								        							}
					        break;
				        } // FINE SWITCH
		        return GS;
	    }
	 	
	 public int generaLI() {
		 
		int scelta = Utility.lancio(1,  100);
	       if(scelta >= 1 && scelta <= 15){
	    	   LI = livPG - Utility.lancio(1, 3);
	    	   if(LI < 1) {
	    		   LI = 1;
	    	   } // Fine 2° if
	       } else if (scelta >= 16 && scelta <= 80) {
	    	   LI = livPG;
		       } else if (scelta >= 81 && scelta <= 95) {
		    	   LI = livPG + Utility.lancio(1, 4);
			       } else if (scelta >= 96 && scelta <= 100) {
			    	   LI = livPG + Utility.lancio(5, 7);
			    	   if(LI > 23) {
			    		   LI = 23;
			    	   } // Fine 2° if
			       }	
		 
		return LI;
	 }

	 
	 public double getGS() {
		return GS;
	}

	 public int getLI() {
			return LI;
		}
	 
	public void setGS(double gS) {
		GS = gS;
	}
	
	
}
