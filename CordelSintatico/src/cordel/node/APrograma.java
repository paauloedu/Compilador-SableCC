/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import java.util.*;
import cordel.analysis.*;

@SuppressWarnings("nls")
public final class APrograma extends PPrograma
{
    private final LinkedList<PDecOrDef> _decOrDef_ = new LinkedList<PDecOrDef>();

    public APrograma()
    {
        // Constructor
    }

    public APrograma(
        @SuppressWarnings("hiding") List<?> _decOrDef_)
    {
        // Constructor
        setDecOrDef(_decOrDef_);

    }

    @Override
    public Object clone()
    {
        return new APrograma(
            cloneList(this._decOrDef_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrograma(this);
    }

    public LinkedList<PDecOrDef> getDecOrDef()
    {
        return this._decOrDef_;
    }

    public void setDecOrDef(List<?> list)
    {
        for(PDecOrDef e : this._decOrDef_)
        {
            e.parent(null);
        }
        this._decOrDef_.clear();

        for(Object obj_e : list)
        {
            PDecOrDef e = (PDecOrDef) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decOrDef_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decOrDef_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decOrDef_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDecOrDef> i = this._decOrDef_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecOrDef) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
