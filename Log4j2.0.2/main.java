public static void main(String[] args) {

  System.err.println("Hello Logging!");

  try {

    int x = 1 / 0;
  } catch (Exception e) {
    LoggerUtil.setLogger(HMI_MODULE);
    System.err.println("HMI Logging ..................");
    LoggerUtil.trace(e);
    LoggerUtil.debug(e);
    LoggerUtil.info(e);
    LoggerUtil.warn(e);
    LoggerUtil.error(e);
    LoggerUtil.fatal(e);

  }
}
