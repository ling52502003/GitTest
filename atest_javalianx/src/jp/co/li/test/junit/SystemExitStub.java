package jp.co.li.test.junit;

import java.security.Permission;

/**
 * System.exit()処理を無効にし代わりにExitExceptionを発生させる.<br>
 * JUnitでSystem.exitのある処理をテストを実施する場合等に使用する。<br>
 * 本クラスはスレッドセーフではないのでマルチスレッド環境では利用不可。<br>
 * シングルトンクラス。
 *
 * @author boss_ape
 */
public class SystemExitStub extends SecurityManager
{
    /** シングルトンパターンのためのインスタンス. */
    private static final SystemExitStub INSTANCE_STUB = new SystemExitStub();

    /** 現在使われている変更前のセキュリティマネージャ. */
    private static final SecurityManager INSTANCE_SYSTEM = System.getSecurityManager();

    /**
     * デフォルトコンストラクタの禁止.
     */
    private SystemExitStub() { }

    /**
     * このクラスのインスタンスを取得.
     *
     * @return このクラスのインスタンス
     */
    public static SystemExitStub getlnstance()
    {
        return INSTANCE_STUB;
    }

    @Override
    public void checkPermission(Permission permission)
    {
        if ("exitVM".equals(permission.getName()))
            System.out.println("System.exit[exitVM]が呼ばれた");
    }

    @Override
    public void checkExit(int status)
    {
        throw new ExitException(status);
    }

    /**
     * System.exit()をExitExceptionに変更設定する.
     */
    public void change()
    {
        // JVMを終了させない
        System.setSecurityManager(INSTANCE_STUB);
    }

    /**
     * System.exit()を元に戻す.
     */
    public void reset()
    {
        System.setSecurityManager(INSTANCE_SYSTEM);
    }

    /**
     * JVMの停止の代わりに発生させるException.
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
