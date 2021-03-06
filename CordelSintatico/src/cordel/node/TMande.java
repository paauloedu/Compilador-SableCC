/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class TMande extends Token
{
    public TMande()
    {
        super.setText("mande");
    }

    public TMande(int line, int pos)
    {
        super.setText("mande");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMande(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMande(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMande text.");
    }
}
