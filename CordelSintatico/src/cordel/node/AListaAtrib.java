/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import java.util.*;
import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AListaAtrib extends PListaAtrib
{
    private PAtribuicao _atribuicao_;
    private final LinkedList<PAtribAux> _atribAux_ = new LinkedList<PAtribAux>();

    public AListaAtrib()
    {
        // Constructor
    }

    public AListaAtrib(
        @SuppressWarnings("hiding") PAtribuicao _atribuicao_,
        @SuppressWarnings("hiding") List<?> _atribAux_)
    {
        // Constructor
        setAtribuicao(_atribuicao_);

        setAtribAux(_atribAux_);

    }

    @Override
    public Object clone()
    {
        return new AListaAtrib(
            cloneNode(this._atribuicao_),
            cloneList(this._atribAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaAtrib(this);
    }

    public PAtribuicao getAtribuicao()
    {
        return this._atribuicao_;
    }

    public void setAtribuicao(PAtribuicao node)
    {
        if(this._atribuicao_ != null)
        {
            this._atribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atribuicao_ = node;
    }

    public LinkedList<PAtribAux> getAtribAux()
    {
        return this._atribAux_;
    }

    public void setAtribAux(List<?> list)
    {
        for(PAtribAux e : this._atribAux_)
        {
            e.parent(null);
        }
        this._atribAux_.clear();

        for(Object obj_e : list)
        {
            PAtribAux e = (PAtribAux) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._atribAux_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._atribuicao_)
            + toString(this._atribAux_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._atribuicao_ == child)
        {
            this._atribuicao_ = null;
            return;
        }

        if(this._atribAux_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._atribuicao_ == oldChild)
        {
            setAtribuicao((PAtribuicao) newChild);
            return;
        }

        for(ListIterator<PAtribAux> i = this._atribAux_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAtribAux) newChild);
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
