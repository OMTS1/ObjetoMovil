
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package gnz.analizadores;

import java_cup.runtime.*;
import gnz.backend.objetoMovil.Movement;
import gnz.backend.objetoMovil.Movement.MovementType;
import gnz.backend.objetoMovil.Movement.MotorType;
import gnz.backend.objetoMovil.Movement.SpeedLevel;
import gnz.backend.objetoMovil.Movement.Orientation;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class CommunicationParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return CommunicationSym.class;
}

  /** Default constructor. */
  @Deprecated
  public CommunicationParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public CommunicationParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public CommunicationParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\004\000\002\002\013\000\002\002" +
    "\013\000\002\002\013\000\002\002\013\000\002\002\013" +
    "\000\002\002\014\000\002\002\015\000\002\007\003\000" +
    "\002\003\003\000\002\004\003\000\002\004\003\000\002" +
    "\005\003\000\002\005\003\000\002\006\003\000\002\006" +
    "\003\000\002\006\003\000\002\006\003\000\002\010\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\020\007\013\010\012\011\010\012\007\013" +
    "\006\014\004\015\011\001\002\000\004\005\111\001\002" +
    "\000\004\002\110\001\002\000\004\005\074\001\002\000" +
    "\004\005\064\001\002\000\004\005\054\001\002\000\004" +
    "\005\040\001\002\000\004\005\030\001\002\000\004\005" +
    "\014\001\002\000\004\024\015\001\002\000\004\022\ufff9" +
    "\001\002\000\004\022\017\001\002\000\004\004\020\001" +
    "\002\000\004\024\021\001\002\000\004\004\ufff8\001\002" +
    "\000\004\004\023\001\002\000\006\016\024\017\025\001" +
    "\002\000\006\004\ufff7\006\ufff7\001\002\000\006\004\ufff6" +
    "\006\ufff6\001\002\000\004\006\027\001\002\000\004\002" +
    "\000\001\002\000\004\024\015\001\002\000\004\022\032" +
    "\001\002\000\004\004\033\001\002\000\004\024\021\001" +
    "\002\000\004\004\035\001\002\000\006\016\024\017\025" +
    "\001\002\000\004\006\037\001\002\000\004\002\uffff\001" +
    "\002\000\004\024\015\001\002\000\004\022\042\001\002" +
    "\000\004\004\043\001\002\000\004\024\021\001\002\000" +
    "\004\004\045\001\002\000\006\016\024\017\025\001\002" +
    "\000\004\004\047\001\002\000\006\020\050\021\051\001" +
    "\002\000\004\006\ufff5\001\002\000\004\006\ufff4\001\002" +
    "\000\004\006\053\001\002\000\004\002\ufffa\001\002\000" +
    "\004\024\015\001\002\000\004\022\056\001\002\000\004" +
    "\004\057\001\002\000\004\024\021\001\002\000\004\004" +
    "\061\001\002\000\006\016\024\017\025\001\002\000\004" +
    "\006\063\001\002\000\004\002\ufffe\001\002\000\004\024" +
    "\015\001\002\000\004\022\066\001\002\000\004\004\067" +
    "\001\002\000\004\024\021\001\002\000\004\004\071\001" +
    "\002\000\006\016\024\017\025\001\002\000\004\006\073" +
    "\001\002\000\004\002\ufffd\001\002\000\004\024\015\001" +
    "\002\000\004\022\076\001\002\000\004\004\077\001\002" +
    "\000\004\024\021\001\002\000\004\004\101\001\002\000" +
    "\012\016\103\017\106\020\102\021\104\001\002\000\004" +
    "\006\ufff1\001\002\000\004\006\ufff3\001\002\000\004\006" +
    "\ufff0\001\002\000\004\006\107\001\002\000\004\006\ufff2" +
    "\001\002\000\004\002\ufffc\001\002\000\004\002\001\001" +
    "\002\000\004\024\015\001\002\000\004\022\113\001\002" +
    "\000\004\004\114\001\002\000\004\024\021\001\002\000" +
    "\004\004\116\001\002\000\004\024\117\001\002\000\004" +
    "\023\uffef\001\002\000\004\023\121\001\002\000\004\006" +
    "\122\001\002\000\004\002\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\015\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\021\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\025\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\030\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\003\033\001\001\000\002\001" +
    "\001\000\004\004\035\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\007\040\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\003\043\001\001\000\002\001\001" +
    "\000\004\004\045\001\001\000\002\001\001\000\004\005" +
    "\051\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\007\054\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\057\001\001" +
    "\000\002\001\001\000\004\004\061\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\064\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\067\001\001\000" +
    "\002\001\001\000\004\004\071\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\074\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\077\001\001\000\002" +
    "\001\001\000\004\006\104\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\007" +
    "\111\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\114\001\001\000\002\001\001\000\004\010\117\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$CommunicationParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$CommunicationParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$CommunicationParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    Movement movement;

    public Movement getMovement(){
        return movement;
    }

    public void syntax_error(Symbol s){ 
        int fil = (s.right)+1;
        int col = (s.left)+1;
        System.out.println("Error Sintáctico en la Línea " + (col) +
        " Columna "+(fil)+ ". No se esperaba este componente: " +s.value+"."); 
    } 

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        int fil = (s.right)+1;
        int col = (s.left)+1;
        System.out.println("Error síntactico irrecuperable en la Línea " + 
        (col)+ " Columna "+(fil)+". Componente " + s.value + 
        " no reconocido."); 
    }  


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$CommunicationParser$actions {
  private final CommunicationParser parser;

  /** Constructor */
  CUP$CommunicationParser$actions(CommunicationParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$CommunicationParser$do_action_part00000000(
    int                        CUP$CommunicationParser$act_num,
    java_cup.runtime.lr_parser CUP$CommunicationParser$parser,
    java.util.Stack            CUP$CommunicationParser$stack,
    int                        CUP$CommunicationParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$CommunicationParser$result;

      /* select the action based on the action number */
      switch (CUP$CommunicationParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= move EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).value;
		RESULT = start_val;
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$CommunicationParser$parser.done_parsing();
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // move ::= MOVEA PARENTHESISO distanceValue CM COMMA speedValue COMMA orientation1 PARENTHESISC 
            {
              Object RESULT =null;
		int distanceleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).left;
		int distanceright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).right;
		Integer distance = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).value;
		int speedleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).left;
		int speedright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).right;
		SpeedLevel speed = (SpeedLevel)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).value;
		int orientationleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).left;
		int orientationright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).right;
		Orientation orientation = (Orientation)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).value;
		 movement = new Movement(MovementType.BASE, MotorType.MOTORA, speed, distance, orientation); 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("move",0, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-8)), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // move ::= MOVEB PARENTHESISO distanceValue CM COMMA speedValue COMMA orientation1 PARENTHESISC 
            {
              Object RESULT =null;
		int distanceleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).left;
		int distanceright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).right;
		Integer distance = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).value;
		int speedleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).left;
		int speedright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).right;
		SpeedLevel speed = (SpeedLevel)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).value;
		int orientationleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).left;
		int orientationright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).right;
		Orientation orientation = (Orientation)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).value;
		 movement = new Movement(MovementType.BASE, MotorType.MOTORB, speed, distance, orientation); 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("move",0, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-8)), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // move ::= MOVEC PARENTHESISO distanceValue CM COMMA speedValue COMMA orientation1 PARENTHESISC 
            {
              Object RESULT =null;
		int distanceleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).left;
		int distanceright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).right;
		Integer distance = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).value;
		int speedleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).left;
		int speedright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).right;
		SpeedLevel speed = (SpeedLevel)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).value;
		int orientationleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).left;
		int orientationright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).right;
		Orientation orientation = (Orientation)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).value;
		 movement = new Movement(MovementType.BASE, MotorType.MOTORC, speed, distance, orientation); 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("move",0, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-8)), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // move ::= MOVED PARENTHESISO distanceValue CM COMMA speedValue COMMA orientation1 PARENTHESISC 
            {
              Object RESULT =null;
		int distanceleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).left;
		int distanceright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).right;
		Integer distance = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).value;
		int speedleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).left;
		int speedright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).right;
		SpeedLevel speed = (SpeedLevel)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).value;
		int orientationleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).left;
		int orientationright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).right;
		Orientation orientation = (Orientation)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).value;
		 movement = new Movement(MovementType.BASE, MotorType.MOTORD, speed, distance, orientation); 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("move",0, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-8)), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // move ::= MOVESTRAIGHT PARENTHESISO distanceValue CM COMMA speedValue COMMA straightOrientation PARENTHESISC 
            {
              Object RESULT =null;
		int distanceleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).left;
		int distanceright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).right;
		Integer distance = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-6)).value;
		int speedleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).left;
		int speedright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).right;
		SpeedLevel speed = (SpeedLevel)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).value;
		int orientationleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).left;
		int orientationright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).right;
		Orientation orientation = (Orientation)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).value;
		 movement = new Movement(MovementType.STRAIGHT, speed, distance, orientation); 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("move",0, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-8)), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // move ::= MOVEDIAGONAL PARENTHESISO distanceValue CM COMMA speedValue COMMA angleValue DEGREES PARENTHESISC 
            {
              Object RESULT =null;
		int distanceleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-7)).left;
		int distanceright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-7)).right;
		Integer distance = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-7)).value;
		int speedleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-4)).left;
		int speedright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-4)).right;
		SpeedLevel speed = (SpeedLevel)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-4)).value;
		int angleleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-2)).left;
		int angleright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-2)).right;
		Integer angle = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-2)).value;
		 movement = new Movement(MovementType.DIAGONAL, speed, distance, angle); 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("move",0, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-9)), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // move ::= MOVECURVED PARENTHESISO distanceValue CM COMMA speedValue COMMA orientation1 COMMA orientation2 PARENTHESISC 
            {
              Object RESULT =null;
		int radioleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-8)).left;
		int radioright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-8)).right;
		Integer radio = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-8)).value;
		int speedleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-5)).left;
		int speedright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-5)).right;
		SpeedLevel speed = (SpeedLevel)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-5)).value;
		int orientation1left = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).left;
		int orientation1right = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).right;
		Orientation orientation1 = (Orientation)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-3)).value;
		int orientation2left = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).left;
		int orientation2right = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).right;
		Orientation orientation2 = (Orientation)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-1)).value;
		 movement = new Movement(MovementType.CURVED, radio, speed, orientation1, orientation2); 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("move",0, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.elementAt(CUP$CommunicationParser$top-10)), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // distanceValue ::= INTEGER 
            {
              Integer RESULT =null;
		int valueleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()).left;
		int valueright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()).right;
		Integer value = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.peek()).value;
		  if(value < 0){
                            RESULT = 0;
                        } else {
                            RESULT = value;
                        } 
                    
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("distanceValue",5, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // speedValue ::= INTEGER 
            {
              SpeedLevel RESULT =null;
		int valueleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()).left;
		int valueright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()).right;
		Integer value = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.peek()).value;
		  switch(value){
                        case 1: RESULT = SpeedLevel.SPEED1; break;
                        case 2: RESULT = SpeedLevel.SPEED2; break;
                        case 3: RESULT = SpeedLevel.SPEED3; break;
                        default: RESULT = SpeedLevel.SPEED1;break;
                    }   
                
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("speedValue",1, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // orientation1 ::= AHEAD 
            {
              Orientation RESULT =null;
		 RESULT = Orientation.AHEAD; 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("orientation1",2, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // orientation1 ::= BEHIND 
            {
              Orientation RESULT =null;
		 RESULT = Orientation.BEHIND; 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("orientation1",2, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // orientation2 ::= UP 
            {
              Orientation RESULT =null;
		 RESULT = Orientation.UP; 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("orientation2",3, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // orientation2 ::= DOWN 
            {
              Orientation RESULT =null;
		 RESULT = Orientation.DOWN; 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("orientation2",3, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // straightOrientation ::= AHEAD 
            {
              Orientation RESULT =null;
		 RESULT = Orientation.AHEAD; 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("straightOrientation",4, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // straightOrientation ::= BEHIND 
            {
              Orientation RESULT =null;
		 RESULT = Orientation.BEHIND; 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("straightOrientation",4, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // straightOrientation ::= UP 
            {
              Orientation RESULT =null;
		 RESULT = Orientation.UP; 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("straightOrientation",4, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // straightOrientation ::= DOWN 
            {
              Orientation RESULT =null;
		 RESULT = Orientation.DOWN; 
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("straightOrientation",4, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // angleValue ::= INTEGER 
            {
              Integer RESULT =null;
		int valueleft = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()).left;
		int valueright = ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()).right;
		Integer value = (Integer)((java_cup.runtime.Symbol) CUP$CommunicationParser$stack.peek()).value;
		  if(value > 360){
                        RESULT = 360;
                    } else if(value < -360){
                        RESULT = -360;
                    } else{
                       RESULT = value;
                    }
                
              CUP$CommunicationParser$result = parser.getSymbolFactory().newSymbol("angleValue",6, ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$CommunicationParser$stack.peek()), RESULT);
            }
          return CUP$CommunicationParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$CommunicationParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$CommunicationParser$do_action(
    int                        CUP$CommunicationParser$act_num,
    java_cup.runtime.lr_parser CUP$CommunicationParser$parser,
    java.util.Stack            CUP$CommunicationParser$stack,
    int                        CUP$CommunicationParser$top)
    throws java.lang.Exception
    {
              return CUP$CommunicationParser$do_action_part00000000(
                               CUP$CommunicationParser$act_num,
                               CUP$CommunicationParser$parser,
                               CUP$CommunicationParser$stack,
                               CUP$CommunicationParser$top);
    }
}

}
