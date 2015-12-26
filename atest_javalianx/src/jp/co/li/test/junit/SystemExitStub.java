package jp.co.li.test.junit;

import java.security.Permission;

/**
 * System.exit()�I���o���ˤ�������ExitException��k��������.<br>
 * JUnit��System.exit�Τ���I���ƥ��Ȥ�gʩ������ϵȤ�ʹ�ä��롣<br>
 * �����饹�ϥ���åɥ��`�դǤϤʤ��Τǥޥ������åɭh���Ǥ����ò��ɡ�<br>
 * ���󥰥�ȥ󥯥饹��
 *
 * @author boss_ape
 */
public class SystemExitStub extends SecurityManager
{
    /** ���󥰥�ȥ�ѥ��`��Τ���Υ��󥹥���. */
    private static final SystemExitStub INSTANCE_STUB = new SystemExitStub();

    /** �F��ʹ���Ƥ�����ǰ�Υ������ƥ��ޥͩ`����. */
    private static final SecurityManager INSTANCE_SYSTEM = System.getSecurityManager();

    /**
     * �ǥե���ȥ��󥹥ȥ饯���ν�ֹ.
     */
    private SystemExitStub() { }

    /**
     * ���Υ��饹�Υ��󥹥��󥹤�ȡ��.
     *
     * @return ���Υ��饹�Υ��󥹥���
     */
    public static SystemExitStub getlnstance()
    {
        return INSTANCE_STUB;
    }

    @Override
    public void checkPermission(Permission permission)
    {
        if ("exitVM".equals(permission.getName()))
            System.out.println("System.exit[exitVM]�����Ф줿");
    }

    @Override
    public void checkExit(int status)
    {
        throw new ExitException(status);
    }

    /**
     * System.exit()��ExitException�ˉ���O������.
     */
    public void change()
    {
        // JVM��K�ˤ����ʤ�
        System.setSecurityManager(INSTANCE_STUB);
    }

    /**
     * System.exit()��Ԫ�ˑ���.
     */
    public void reset()
    {
        System.setSecurityManager(INSTANCE_SYSTEM);
    }

    /**
     * JVM��ֹͣ�δ����˰k��������Exception.
     *
     * @author boss_ape
     */
    public class ExitException extends SecurityException
    {
        public int state = 0;

        public ExitException(int state)
        {
            this.state = state;
        }
    }
}
