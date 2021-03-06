/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import java.util.*;
import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AListaNomes extends PListaNomes
{
    private TId _id_;
    private final LinkedList<PIdAux> _idAux_ = new LinkedList<PIdAux>();

    public AListaNomes()
    {
        // Constructor
    }

    public AListaNomes(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") List<?> _idAux_)
    {
        // Constructor
        setId(_id_);

        setIdAux(_idAux_);

    }

    @Override
    public Object clone()
    {
        return new AListaNomes(
            cloneNode(this._id_),
            cloneList(this._idAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaNomes(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public LinkedList<PIdAux> getIdAux()
    {
        return this._idAux_;
    }

    public void setIdAux(List<?> list)
    {
        for(PIdAux e : this._idAux_)
        {
            e.parent(null);
        }
        this._idAux_.clear();

        for(Object obj_e : list)
        {
            PIdAux e = (PIdAux) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._idAux_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._idAux_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._idAux_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        for(ListIterator<PIdAux> i = this._idAux_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PIdAux) newChild);
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
